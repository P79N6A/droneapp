.class public Lorg/codehaus/jackson/JsonLocation;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final NA:Lorg/codehaus/jackson/JsonLocation;

.field private static final serialVersionUID:J = 0x1L


# instance fields
.field final _columnNr:I

.field final _lineNr:I

.field final _sourceRef:Ljava/lang/Object;

.field final _totalBytes:J

.field final _totalChars:J


# direct methods
.method static constructor <clinit>()V
    .locals 8

    const-wide/16 v2, -0x1

    const/4 v6, -0x1

    new-instance v0, Lorg/codehaus/jackson/JsonLocation;

    const-string v1, "N/A"

    move-wide v4, v2

    move v7, v6

    invoke-direct/range {v0 .. v7}, Lorg/codehaus/jackson/JsonLocation;-><init>(Ljava/lang/Object;JJII)V

    sput-object v0, Lorg/codehaus/jackson/JsonLocation;->NA:Lorg/codehaus/jackson/JsonLocation;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;JII)V
    .locals 8

    const-wide/16 v2, -0x1

    move-object v0, p0

    move-object v1, p1

    move-wide v4, p2

    move v6, p4

    move v7, p5

    invoke-direct/range {v0 .. v7}, Lorg/codehaus/jackson/JsonLocation;-><init>(Ljava/lang/Object;JJII)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;JJII)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lorg/codehaus/jackson/annotate/JsonProperty;
            value = "sourceRef"
        .end annotation
    .end param
    .param p2    # J
        .annotation runtime Lorg/codehaus/jackson/annotate/JsonProperty;
            value = "byteOffset"
        .end annotation
    .end param
    .param p4    # J
        .annotation runtime Lorg/codehaus/jackson/annotate/JsonProperty;
            value = "charOffset"
        .end annotation
    .end param
    .param p6    # I
        .annotation runtime Lorg/codehaus/jackson/annotate/JsonProperty;
            value = "lineNr"
        .end annotation
    .end param
    .param p7    # I
        .annotation runtime Lorg/codehaus/jackson/annotate/JsonProperty;
            value = "columnNr"
        .end annotation
    .end param
    .annotation runtime Lorg/codehaus/jackson/annotate/JsonCreator;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/codehaus/jackson/JsonLocation;->_sourceRef:Ljava/lang/Object;

    iput-wide p2, p0, Lorg/codehaus/jackson/JsonLocation;->_totalBytes:J

    iput-wide p4, p0, Lorg/codehaus/jackson/JsonLocation;->_totalChars:J

    iput p6, p0, Lorg/codehaus/jackson/JsonLocation;->_lineNr:I

    iput p7, p0, Lorg/codehaus/jackson/JsonLocation;->_columnNr:I

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p1, p0, :cond_1

    move v1, v0

    :cond_0
    :goto_0
    return v1

    :cond_1
    if-eqz p1, :cond_0

    instance-of v2, p1, Lorg/codehaus/jackson/JsonLocation;

    if-eqz v2, :cond_0

    check-cast p1, Lorg/codehaus/jackson/JsonLocation;

    iget-object v2, p0, Lorg/codehaus/jackson/JsonLocation;->_sourceRef:Ljava/lang/Object;

    if-nez v2, :cond_3

    iget-object v2, p1, Lorg/codehaus/jackson/JsonLocation;->_sourceRef:Ljava/lang/Object;

    if-nez v2, :cond_0

    :cond_2
    iget v2, p0, Lorg/codehaus/jackson/JsonLocation;->_lineNr:I

    iget v3, p1, Lorg/codehaus/jackson/JsonLocation;->_lineNr:I

    if-ne v2, v3, :cond_4

    iget v2, p0, Lorg/codehaus/jackson/JsonLocation;->_columnNr:I

    iget v3, p1, Lorg/codehaus/jackson/JsonLocation;->_columnNr:I

    if-ne v2, v3, :cond_4

    iget-wide v2, p0, Lorg/codehaus/jackson/JsonLocation;->_totalChars:J

    iget-wide v4, p1, Lorg/codehaus/jackson/JsonLocation;->_totalChars:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_4

    invoke-virtual {p0}, Lorg/codehaus/jackson/JsonLocation;->getByteOffset()J

    move-result-wide v2

    invoke-virtual {p1}, Lorg/codehaus/jackson/JsonLocation;->getByteOffset()J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-nez v2, :cond_4

    :goto_1
    move v1, v0

    goto :goto_0

    :cond_3
    iget-object v2, p0, Lorg/codehaus/jackson/JsonLocation;->_sourceRef:Ljava/lang/Object;

    iget-object v3, p1, Lorg/codehaus/jackson/JsonLocation;->_sourceRef:Ljava/lang/Object;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_0

    :cond_4
    move v0, v1

    goto :goto_1
.end method

.method public getByteOffset()J
    .locals 2

    iget-wide v0, p0, Lorg/codehaus/jackson/JsonLocation;->_totalBytes:J

    return-wide v0
.end method

.method public getCharOffset()J
    .locals 2

    iget-wide v0, p0, Lorg/codehaus/jackson/JsonLocation;->_totalChars:J

    return-wide v0
.end method

.method public getColumnNr()I
    .locals 1

    iget v0, p0, Lorg/codehaus/jackson/JsonLocation;->_columnNr:I

    return v0
.end method

.method public getLineNr()I
    .locals 1

    iget v0, p0, Lorg/codehaus/jackson/JsonLocation;->_lineNr:I

    return v0
.end method

.method public getSourceRef()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lorg/codehaus/jackson/JsonLocation;->_sourceRef:Ljava/lang/Object;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lorg/codehaus/jackson/JsonLocation;->_sourceRef:Ljava/lang/Object;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    iget v1, p0, Lorg/codehaus/jackson/JsonLocation;->_lineNr:I

    xor-int/2addr v0, v1

    iget v1, p0, Lorg/codehaus/jackson/JsonLocation;->_columnNr:I

    add-int/2addr v0, v1

    iget-wide v2, p0, Lorg/codehaus/jackson/JsonLocation;->_totalChars:J

    long-to-int v1, v2

    xor-int/2addr v0, v1

    iget-wide v2, p0, Lorg/codehaus/jackson/JsonLocation;->_totalBytes:J

    long-to-int v1, v2

    add-int/2addr v0, v1

    return v0

    :cond_0
    iget-object v0, p0, Lorg/codehaus/jackson/JsonLocation;->_sourceRef:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x50

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "[Source: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/codehaus/jackson/JsonLocation;->_sourceRef:Ljava/lang/Object;

    if-nez v1, :cond_0

    const-string v1, "UNKNOWN"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    const-string v1, "; line: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lorg/codehaus/jackson/JsonLocation;->_lineNr:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", column: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lorg/codehaus/jackson/JsonLocation;->_columnNr:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v1, p0, Lorg/codehaus/jackson/JsonLocation;->_sourceRef:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0
.end method
