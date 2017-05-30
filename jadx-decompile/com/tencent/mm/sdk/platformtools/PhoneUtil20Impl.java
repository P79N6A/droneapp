package com.tencent.mm.sdk.platformtools;

import android.content.Context;
import android.telephony.NeighboringCellInfo;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import com.tencent.mm.sdk.platformtools.PhoneUtil.CellInfo;
import java.util.LinkedList;
import java.util.List;

class PhoneUtil20Impl {
    private static int aK = 10000;
    private static int aL = 10000;
    private TelephonyManager aM;
    private PhoneStateListener aN = new PhoneStateListener(this) {
        final /* synthetic */ PhoneUtil20Impl aQ;

        {
            this.aQ = r1;
        }

        public void onSignalStrengthsChanged(SignalStrength signalStrength) {
            super.onSignalStrengthsChanged(signalStrength);
            if (this.aQ.aP == 2) {
                PhoneUtil20Impl.aL = signalStrength.getCdmaDbm();
            }
            if (this.aQ.aP == 1) {
                PhoneUtil20Impl.aL = (signalStrength.getGsmSignalStrength() * 2) - 113;
            }
            if (this.aQ.aM != null) {
                this.aQ.aM.listen(this.aQ.aN, 0);
            }
        }
    };
    private int aP;

    PhoneUtil20Impl() {
    }

    public List<CellInfo> getCellInfoList(Context context) {
        GsmCellLocation gsmCellLocation;
        List<NeighboringCellInfo> neighboringCellInfo;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        List<CellInfo> linkedList = new LinkedList();
        String str = "460";
        String str2 = "";
        try {
            String networkOperator = telephonyManager.getNetworkOperator();
            if (networkOperator == null || networkOperator.equals("")) {
                networkOperator = telephonyManager.getSimOperator();
                if (!(networkOperator == null || networkOperator.equals(""))) {
                    str = networkOperator.substring(0, 3);
                    str2 = networkOperator.substring(3, 5);
                }
                networkOperator = str2;
            } else {
                str = networkOperator.substring(0, 3);
                networkOperator = networkOperator.substring(3, 5);
            }
            String str3;
            int cid;
            int lac;
            if (telephonyManager.getPhoneType() == 2) {
                try {
                    CdmaCellLocation cdmaCellLocation = (CdmaCellLocation) telephonyManager.getCellLocation();
                    if (cdmaCellLocation != null) {
                        str3 = aL == aK ? "" : aL;
                        if (!(cdmaCellLocation.getBaseStationId() == -1 || cdmaCellLocation.getNetworkId() == -1 || cdmaCellLocation.getSystemId() == -1)) {
                            linkedList.add(new CellInfo(str, networkOperator, "", "", str3, PhoneUtil.CELL_CDMA, cdmaCellLocation.getBaseStationId(), cdmaCellLocation.getNetworkId(), cdmaCellLocation.getSystemId()));
                        }
                    }
                } catch (Exception e) {
                    try {
                        gsmCellLocation = (GsmCellLocation) telephonyManager.getCellLocation();
                        if (gsmCellLocation != null) {
                            cid = gsmCellLocation.getCid();
                            lac = gsmCellLocation.getLac();
                            if (!(lac >= 65535 || lac == -1 || cid == -1)) {
                                linkedList.add(new CellInfo(str, networkOperator, String.valueOf(lac), String.valueOf(cid), "", PhoneUtil.CELL_GSM, "", "", ""));
                            }
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    neighboringCellInfo = telephonyManager.getNeighboringCellInfo();
                    if (neighboringCellInfo != null && neighboringCellInfo.size() > 0) {
                        for (NeighboringCellInfo neighboringCellInfo2 : neighboringCellInfo) {
                            if (!(neighboringCellInfo2.getCid() == -1 || neighboringCellInfo2.getLac() > 65535 || neighboringCellInfo2.getLac() == -1)) {
                                linkedList.add(new CellInfo(str, networkOperator, neighboringCellInfo2.getLac(), neighboringCellInfo2.getCid(), ((neighboringCellInfo2.getRssi() * 2) - 113), PhoneUtil.CELL_GSM, "", "", ""));
                            }
                        }
                    }
                }
            } else {
                try {
                    gsmCellLocation = (GsmCellLocation) telephonyManager.getCellLocation();
                    if (gsmCellLocation != null) {
                        cid = gsmCellLocation.getCid();
                        lac = gsmCellLocation.getLac();
                        if (!(lac >= 65535 || lac == -1 || cid == -1)) {
                            linkedList.add(new CellInfo(str, networkOperator, String.valueOf(lac), String.valueOf(cid), aL == aK ? "" : aL, PhoneUtil.CELL_GSM, "", "", ""));
                        }
                    }
                } catch (Exception e22) {
                    e22.printStackTrace();
                }
                neighboringCellInfo = telephonyManager.getNeighboringCellInfo();
                if (neighboringCellInfo != null && neighboringCellInfo.size() > 0) {
                    for (NeighboringCellInfo neighboringCellInfo22 : neighboringCellInfo) {
                        if (neighboringCellInfo22.getCid() != -1 && neighboringCellInfo22.getLac() <= 65535) {
                            str3 = ((neighboringCellInfo22.getRssi() * 2) - 113);
                            Log.v("checked", "lac:" + neighboringCellInfo22.getLac() + "  cid:" + neighboringCellInfo22.getCid() + " dbm:" + str3);
                            linkedList.add(new CellInfo(str, networkOperator, neighboringCellInfo22.getLac(), neighboringCellInfo22.getCid(), str3, PhoneUtil.CELL_GSM, "", "", ""));
                        }
                    }
                }
            }
            return linkedList;
        } catch (Exception e222) {
            e222.printStackTrace();
            return linkedList;
        }
    }

    public void getSignalStrength(Context context) {
        this.aM = (TelephonyManager) context.getSystemService("phone");
        this.aM.listen(this.aN, 256);
        this.aP = this.aM.getPhoneType();
    }
}
