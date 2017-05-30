package org.codehaus.jackson.smile;

import java.io.InputStream;
import org.codehaus.jackson.JsonLocation;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.JsonParser$Feature;
import org.codehaus.jackson.ObjectCodec;
import org.codehaus.jackson.format.InputAccessor;
import org.codehaus.jackson.format.MatchStrength;
import org.codehaus.jackson.io.IOContext;
import org.codehaus.jackson.org.objectweb.asm.Opcodes;
import org.codehaus.jackson.smile.SmileParser.Feature;
import org.codehaus.jackson.sym.BytesToNameCanonicalizer;

public class SmileParserBootstrapper {
    private final boolean _bufferRecyclable;
    final IOContext _context;
    final InputStream _in;
    final byte[] _inputBuffer;
    private int _inputEnd;
    protected int _inputProcessed;
    private int _inputPtr;

    public SmileParserBootstrapper(IOContext iOContext, InputStream inputStream) {
        this._context = iOContext;
        this._in = inputStream;
        this._inputBuffer = iOContext.allocReadIOBuffer();
        this._inputPtr = 0;
        this._inputEnd = 0;
        this._inputProcessed = 0;
        this._bufferRecyclable = true;
    }

    public SmileParserBootstrapper(IOContext iOContext, byte[] bArr, int i, int i2) {
        this._context = iOContext;
        this._in = null;
        this._inputBuffer = bArr;
        this._inputPtr = i;
        this._inputEnd = i + i2;
        this._inputProcessed = -i;
        this._bufferRecyclable = false;
    }

    public static MatchStrength hasSmileFormat(InputAccessor inputAccessor) {
        if (!inputAccessor.hasMoreBytes()) {
            return MatchStrength.INCONCLUSIVE;
        }
        byte nextByte = inputAccessor.nextByte();
        if (!inputAccessor.hasMoreBytes()) {
            return MatchStrength.INCONCLUSIVE;
        }
        byte nextByte2 = inputAccessor.nextByte();
        if (nextByte == SmileConstants.HEADER_BYTE_1) {
            return nextByte2 != SmileConstants.HEADER_BYTE_2 ? MatchStrength.NO_MATCH : !inputAccessor.hasMoreBytes() ? MatchStrength.INCONCLUSIVE : inputAccessor.nextByte() == (byte) 10 ? MatchStrength.FULL_MATCH : MatchStrength.NO_MATCH;
        } else {
            if (nextByte != (byte) -6) {
                return nextByte == (byte) -8 ? !inputAccessor.hasMoreBytes() ? MatchStrength.INCONCLUSIVE : (likelySmileValue(nextByte2) || possibleSmileValue(nextByte2, true)) ? MatchStrength.SOLID_MATCH : MatchStrength.NO_MATCH : (likelySmileValue(nextByte) || possibleSmileValue(nextByte2, false)) ? MatchStrength.SOLID_MATCH : MatchStrength.NO_MATCH;
            } else {
                if (nextByte2 == SmileConstants.TOKEN_KEY_LONG_STRING) {
                    return MatchStrength.SOLID_MATCH;
                }
                int i = nextByte2 & 255;
                return (i < 128 || i >= 248) ? MatchStrength.NO_MATCH : MatchStrength.SOLID_MATCH;
            }
        }
    }

    private static boolean likelySmileValue(byte b) {
        int i = b & 255;
        if (i < 224) {
            return i >= 128 && i <= Opcodes.IF_ICMPEQ;
        } else {
            switch (i) {
                case -8:
                case -6:
                case 224:
                case SmileConstants.TOKEN_MISC_LONG_TEXT_UNICODE /*228*/:
                case SmileConstants.TOKEN_MISC_BINARY_7BIT /*232*/:
                    return true;
                default:
                    return false;
            }
        }
    }

    private static boolean possibleSmileValue(byte b, boolean z) {
        int i = b & 255;
        if (i >= 128) {
            return i <= 224;
        } else {
            if (z) {
                if (i >= 64) {
                    return true;
                }
                if (i > -32) {
                    return i < 44;
                }
            }
            return false;
        }
    }

    public SmileParser constructParser(int i, int i2, ObjectCodec objectCodec, BytesToNameCanonicalizer bytesToNameCanonicalizer) {
        BytesToNameCanonicalizer makeChild = bytesToNameCanonicalizer.makeChild(true, JsonParser$Feature.INTERN_FIELD_NAMES.enabledIn(i));
        ensureLoaded(1);
        SmileParser smileParser = new SmileParser(this._context, i, i2, objectCodec, makeChild, this._in, this._inputBuffer, this._inputPtr, this._inputEnd, this._bufferRecyclable);
        boolean z = false;
        if (this._inputPtr < this._inputEnd && this._inputBuffer[this._inputPtr] == SmileConstants.HEADER_BYTE_1) {
            z = smileParser.handleSignature(true, true);
        }
        if (z || (Feature.REQUIRE_HEADER.getMask() & i2) == 0) {
            return smileParser;
        }
        int i3 = this._inputPtr < this._inputEnd ? this._inputBuffer[this._inputPtr] : 0;
        String str = (i3 == Opcodes.LSHR || i3 == 91) ? "Input does not start with Smile format header (first byte = 0x" + Integer.toHexString(i3 & 255) + ") -- rather, it starts with '" + ((char) i3) + "' (plain JSON input?) -- can not parse" : "Input does not start with Smile format header (first byte = 0x" + Integer.toHexString(i3 & 255) + ") and parser has REQUIRE_HEADER enabled: can not parse";
        throw new JsonParseException(str, JsonLocation.NA);
    }

    protected boolean ensureLoaded(int i) {
        if (this._in == null) {
            return false;
        }
        int i2 = this._inputEnd - this._inputPtr;
        while (i2 < i) {
            int read = this._in.read(this._inputBuffer, this._inputEnd, this._inputBuffer.length - this._inputEnd);
            if (read < 1) {
                return false;
            }
            this._inputEnd += read;
            i2 += read;
        }
        return true;
    }
}
