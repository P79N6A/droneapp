package com.google.android.gms.drive.internal;

import android.content.IntentSender;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.drive.RealtimeDocumentSyncRequest;

public interface n extends IInterface {

    public static abstract class a extends Binder implements n {

        private static class a implements n {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public IntentSender a(CreateFileIntentSenderRequest createFileIntentSenderRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (createFileIntentSenderRequest != null) {
                        obtain.writeInt(1);
                        createFileIntentSenderRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    IntentSender intentSender = obtain2.readInt() != 0 ? (IntentSender) IntentSender.CREATOR.createFromParcel(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    return intentSender;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IntentSender a(OpenFileIntentSenderRequest openFileIntentSenderRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (openFileIntentSenderRequest != null) {
                        obtain.writeInt(1);
                        openFileIntentSenderRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    IntentSender intentSender = obtain2.readInt() != 0 ? (IntentSender) IntentSender.CREATOR.createFromParcel(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    return intentSender;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public DriveServiceResponse a(OpenContentsRequest openContentsRequest, o oVar) {
                DriveServiceResponse driveServiceResponse = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (openContentsRequest != null) {
                        obtain.writeInt(1);
                        openContentsRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(oVar != null ? oVar.asBinder() : null);
                    this.a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        driveServiceResponse = (DriveServiceResponse) DriveServiceResponse.CREATOR.createFromParcel(obtain2);
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return driveServiceResponse;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public DriveServiceResponse a(StreamContentsRequest streamContentsRequest, o oVar) {
                DriveServiceResponse driveServiceResponse = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (streamContentsRequest != null) {
                        obtain.writeInt(1);
                        streamContentsRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(oVar != null ? oVar.asBinder() : null);
                    this.a.transact(56, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        driveServiceResponse = (DriveServiceResponse) DriveServiceResponse.CREATOR.createFromParcel(obtain2);
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return driveServiceResponse;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(RealtimeDocumentSyncRequest realtimeDocumentSyncRequest, o oVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (realtimeDocumentSyncRequest != null) {
                        obtain.writeInt(1);
                        realtimeDocumentSyncRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(oVar != null ? oVar.asBinder() : null);
                    this.a.transact(34, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(AddEventListenerRequest addEventListenerRequest, p pVar, String str, o oVar) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (addEventListenerRequest != null) {
                        obtain.writeInt(1);
                        addEventListenerRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(pVar != null ? pVar.asBinder() : null);
                    obtain.writeString(str);
                    if (oVar != null) {
                        iBinder = oVar.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(AddPermissionRequest addPermissionRequest, o oVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (addPermissionRequest != null) {
                        obtain.writeInt(1);
                        addPermissionRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(oVar != null ? oVar.asBinder() : null);
                    this.a.transact(48, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(AuthorizeAccessRequest authorizeAccessRequest, o oVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (authorizeAccessRequest != null) {
                        obtain.writeInt(1);
                        authorizeAccessRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(oVar != null ? oVar.asBinder() : null);
                    this.a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(CancelPendingActionsRequest cancelPendingActionsRequest, o oVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (cancelPendingActionsRequest != null) {
                        obtain.writeInt(1);
                        cancelPendingActionsRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(oVar != null ? oVar.asBinder() : null);
                    this.a.transact(37, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(ChangeResourceParentsRequest changeResourceParentsRequest, o oVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (changeResourceParentsRequest != null) {
                        obtain.writeInt(1);
                        changeResourceParentsRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(oVar != null ? oVar.asBinder() : null);
                    this.a.transact(55, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(CheckResourceIdsExistRequest checkResourceIdsExistRequest, o oVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (checkResourceIdsExistRequest != null) {
                        obtain.writeInt(1);
                        checkResourceIdsExistRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(oVar != null ? oVar.asBinder() : null);
                    this.a.transact(30, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(CloseContentsAndUpdateMetadataRequest closeContentsAndUpdateMetadataRequest, o oVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (closeContentsAndUpdateMetadataRequest != null) {
                        obtain.writeInt(1);
                        closeContentsAndUpdateMetadataRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(oVar != null ? oVar.asBinder() : null);
                    this.a.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(CloseContentsRequest closeContentsRequest, o oVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (closeContentsRequest != null) {
                        obtain.writeInt(1);
                        closeContentsRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(oVar != null ? oVar.asBinder() : null);
                    this.a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(ControlProgressRequest controlProgressRequest, o oVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (controlProgressRequest != null) {
                        obtain.writeInt(1);
                        controlProgressRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(oVar != null ? oVar.asBinder() : null);
                    this.a.transact(53, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(CreateContentsRequest createContentsRequest, o oVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (createContentsRequest != null) {
                        obtain.writeInt(1);
                        createContentsRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(oVar != null ? oVar.asBinder() : null);
                    this.a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(CreateFileRequest createFileRequest, o oVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (createFileRequest != null) {
                        obtain.writeInt(1);
                        createFileRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(oVar != null ? oVar.asBinder() : null);
                    this.a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(CreateFolderRequest createFolderRequest, o oVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (createFolderRequest != null) {
                        obtain.writeInt(1);
                        createFolderRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(oVar != null ? oVar.asBinder() : null);
                    this.a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(DeleteResourceRequest deleteResourceRequest, o oVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (deleteResourceRequest != null) {
                        obtain.writeInt(1);
                        deleteResourceRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(oVar != null ? oVar.asBinder() : null);
                    this.a.transact(24, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(DisconnectRequest disconnectRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (disconnectRequest != null) {
                        obtain.writeInt(1);
                        disconnectRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(FetchThumbnailRequest fetchThumbnailRequest, o oVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (fetchThumbnailRequest != null) {
                        obtain.writeInt(1);
                        fetchThumbnailRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(oVar != null ? oVar.asBinder() : null);
                    this.a.transact(42, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(GetChangesRequest getChangesRequest, o oVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (getChangesRequest != null) {
                        obtain.writeInt(1);
                        getChangesRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(oVar != null ? oVar.asBinder() : null);
                    this.a.transact(44, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(GetDriveIdFromUniqueIdentifierRequest getDriveIdFromUniqueIdentifierRequest, o oVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (getDriveIdFromUniqueIdentifierRequest != null) {
                        obtain.writeInt(1);
                        getDriveIdFromUniqueIdentifierRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(oVar != null ? oVar.asBinder() : null);
                    this.a.transact(29, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(GetMetadataRequest getMetadataRequest, o oVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (getMetadataRequest != null) {
                        obtain.writeInt(1);
                        getMetadataRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(oVar != null ? oVar.asBinder() : null);
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(GetPermissionsRequest getPermissionsRequest, o oVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (getPermissionsRequest != null) {
                        obtain.writeInt(1);
                        getPermissionsRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(oVar != null ? oVar.asBinder() : null);
                    this.a.transact(47, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(ListParentsRequest listParentsRequest, o oVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (listParentsRequest != null) {
                        obtain.writeInt(1);
                        listParentsRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(oVar != null ? oVar.asBinder() : null);
                    this.a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(LoadRealtimeRequest loadRealtimeRequest, o oVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (loadRealtimeRequest != null) {
                        obtain.writeInt(1);
                        loadRealtimeRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(oVar != null ? oVar.asBinder() : null);
                    this.a.transact(27, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(QueryRequest queryRequest, o oVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (queryRequest != null) {
                        obtain.writeInt(1);
                        queryRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(oVar != null ? oVar.asBinder() : null);
                    this.a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(QueryRequest queryRequest, p pVar, o oVar) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (queryRequest != null) {
                        obtain.writeInt(1);
                        queryRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(pVar != null ? pVar.asBinder() : null);
                    if (oVar != null) {
                        iBinder = oVar.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.a.transact(51, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(RemoveEventListenerRequest removeEventListenerRequest, p pVar, String str, o oVar) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (removeEventListenerRequest != null) {
                        obtain.writeInt(1);
                        removeEventListenerRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(pVar != null ? pVar.asBinder() : null);
                    obtain.writeString(str);
                    if (oVar != null) {
                        iBinder = oVar.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.a.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(RemovePermissionRequest removePermissionRequest, o oVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (removePermissionRequest != null) {
                        obtain.writeInt(1);
                        removePermissionRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(oVar != null ? oVar.asBinder() : null);
                    this.a.transact(50, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(SetFileUploadPreferencesRequest setFileUploadPreferencesRequest, o oVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (setFileUploadPreferencesRequest != null) {
                        obtain.writeInt(1);
                        setFileUploadPreferencesRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(oVar != null ? oVar.asBinder() : null);
                    this.a.transact(36, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(SetPinnedDownloadPreferencesRequest setPinnedDownloadPreferencesRequest, o oVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (setPinnedDownloadPreferencesRequest != null) {
                        obtain.writeInt(1);
                        setPinnedDownloadPreferencesRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(oVar != null ? oVar.asBinder() : null);
                    this.a.transact(33, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(SetResourceParentsRequest setResourceParentsRequest, o oVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (setResourceParentsRequest != null) {
                        obtain.writeInt(1);
                        setResourceParentsRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(oVar != null ? oVar.asBinder() : null);
                    this.a.transact(28, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(TrashResourceRequest trashResourceRequest, o oVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (trashResourceRequest != null) {
                        obtain.writeInt(1);
                        trashResourceRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(oVar != null ? oVar.asBinder() : null);
                    this.a.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(UnsubscribeResourceRequest unsubscribeResourceRequest, o oVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (unsubscribeResourceRequest != null) {
                        obtain.writeInt(1);
                        unsubscribeResourceRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(oVar != null ? oVar.asBinder() : null);
                    this.a.transact(46, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(UntrashResourceRequest untrashResourceRequest, o oVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (untrashResourceRequest != null) {
                        obtain.writeInt(1);
                        untrashResourceRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(oVar != null ? oVar.asBinder() : null);
                    this.a.transact(38, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(UpdateMetadataRequest updateMetadataRequest, o oVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (updateMetadataRequest != null) {
                        obtain.writeInt(1);
                        updateMetadataRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(oVar != null ? oVar.asBinder() : null);
                    this.a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(UpdatePermissionRequest updatePermissionRequest, o oVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (updatePermissionRequest != null) {
                        obtain.writeInt(1);
                        updatePermissionRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(oVar != null ? oVar.asBinder() : null);
                    this.a.transact(49, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(o oVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    obtain.writeStrongBinder(oVar != null ? oVar.asBinder() : null);
                    this.a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(p pVar, o oVar) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    obtain.writeStrongBinder(pVar != null ? pVar.asBinder() : null);
                    if (oVar != null) {
                        iBinder = oVar.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.a.transact(52, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.a;
            }

            public void b(QueryRequest queryRequest, o oVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (queryRequest != null) {
                        obtain.writeInt(1);
                        queryRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(oVar != null ? oVar.asBinder() : null);
                    this.a.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void b(o oVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    obtain.writeStrongBinder(oVar != null ? oVar.asBinder() : null);
                    this.a.transact(31, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void c(o oVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    obtain.writeStrongBinder(oVar != null ? oVar.asBinder() : null);
                    this.a.transact(32, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void d(o oVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    obtain.writeStrongBinder(oVar != null ? oVar.asBinder() : null);
                    this.a.transact(35, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void e(o oVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    obtain.writeStrongBinder(oVar != null ? oVar.asBinder() : null);
                    this.a.transact(41, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void f(o oVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    obtain.writeStrongBinder(oVar != null ? oVar.asBinder() : null);
                    this.a.transact(43, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void g(o oVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    obtain.writeStrongBinder(oVar != null ? oVar.asBinder() : null);
                    this.a.transact(54, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void h(o oVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    obtain.writeStrongBinder(oVar != null ? oVar.asBinder() : null);
                    this.a.transact(57, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static n a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.drive.internal.IDriveService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof n)) ? new a(iBinder) : (n) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            StreamContentsRequest streamContentsRequest = null;
            QueryRequest queryRequest;
            DriveServiceResponse a;
            IntentSender a2;
            switch (i) {
                case 1:
                    GetMetadataRequest getMetadataRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        getMetadataRequest = (GetMetadataRequest) GetMetadataRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(getMetadataRequest, com.google.android.gms.drive.internal.o.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        queryRequest = (QueryRequest) QueryRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(queryRequest, com.google.android.gms.drive.internal.o.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 3:
                    UpdateMetadataRequest updateMetadataRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        updateMetadataRequest = (UpdateMetadataRequest) UpdateMetadataRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(updateMetadataRequest, com.google.android.gms.drive.internal.o.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    CreateContentsRequest createContentsRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        createContentsRequest = (CreateContentsRequest) CreateContentsRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(createContentsRequest, com.google.android.gms.drive.internal.o.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    CreateFileRequest createFileRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        createFileRequest = (CreateFileRequest) CreateFileRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(createFileRequest, com.google.android.gms.drive.internal.o.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    CreateFolderRequest createFolderRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        createFolderRequest = (CreateFolderRequest) CreateFolderRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(createFolderRequest, com.google.android.gms.drive.internal.o.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 7:
                    OpenContentsRequest openContentsRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        openContentsRequest = (OpenContentsRequest) OpenContentsRequest.CREATOR.createFromParcel(parcel);
                    }
                    a = a(openContentsRequest, com.google.android.gms.drive.internal.o.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    if (a != null) {
                        parcel2.writeInt(1);
                        a.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 8:
                    CloseContentsRequest closeContentsRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        closeContentsRequest = (CloseContentsRequest) CloseContentsRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(closeContentsRequest, com.google.android.gms.drive.internal.o.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    a(com.google.android.gms.drive.internal.o.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 10:
                    OpenFileIntentSenderRequest openFileIntentSenderRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        openFileIntentSenderRequest = (OpenFileIntentSenderRequest) OpenFileIntentSenderRequest.CREATOR.createFromParcel(parcel);
                    }
                    a2 = a(openFileIntentSenderRequest);
                    parcel2.writeNoException();
                    if (a2 != null) {
                        parcel2.writeInt(1);
                        a2.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 11:
                    CreateFileIntentSenderRequest createFileIntentSenderRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        createFileIntentSenderRequest = (CreateFileIntentSenderRequest) CreateFileIntentSenderRequest.CREATOR.createFromParcel(parcel);
                    }
                    a2 = a(createFileIntentSenderRequest);
                    parcel2.writeNoException();
                    if (a2 != null) {
                        parcel2.writeInt(1);
                        a2.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 12:
                    AuthorizeAccessRequest authorizeAccessRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        authorizeAccessRequest = (AuthorizeAccessRequest) AuthorizeAccessRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(authorizeAccessRequest, com.google.android.gms.drive.internal.o.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 13:
                    ListParentsRequest listParentsRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        listParentsRequest = (ListParentsRequest) ListParentsRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(listParentsRequest, com.google.android.gms.drive.internal.o.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 14:
                    AddEventListenerRequest addEventListenerRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        addEventListenerRequest = (AddEventListenerRequest) AddEventListenerRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(addEventListenerRequest, com.google.android.gms.drive.internal.p.a.a(parcel.readStrongBinder()), parcel.readString(), com.google.android.gms.drive.internal.o.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 15:
                    RemoveEventListenerRequest removeEventListenerRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        removeEventListenerRequest = (RemoveEventListenerRequest) RemoveEventListenerRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(removeEventListenerRequest, com.google.android.gms.drive.internal.p.a.a(parcel.readStrongBinder()), parcel.readString(), com.google.android.gms.drive.internal.o.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 16:
                    DisconnectRequest disconnectRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        disconnectRequest = (DisconnectRequest) DisconnectRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(disconnectRequest);
                    parcel2.writeNoException();
                    return true;
                case 17:
                    TrashResourceRequest trashResourceRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        trashResourceRequest = (TrashResourceRequest) TrashResourceRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(trashResourceRequest, com.google.android.gms.drive.internal.o.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 18:
                    CloseContentsAndUpdateMetadataRequest closeContentsAndUpdateMetadataRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        closeContentsAndUpdateMetadataRequest = (CloseContentsAndUpdateMetadataRequest) CloseContentsAndUpdateMetadataRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(closeContentsAndUpdateMetadataRequest, com.google.android.gms.drive.internal.o.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 19:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        queryRequest = (QueryRequest) QueryRequest.CREATOR.createFromParcel(parcel);
                    }
                    b(queryRequest, com.google.android.gms.drive.internal.o.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 24:
                    DeleteResourceRequest deleteResourceRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        deleteResourceRequest = (DeleteResourceRequest) DeleteResourceRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(deleteResourceRequest, com.google.android.gms.drive.internal.o.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 27:
                    LoadRealtimeRequest loadRealtimeRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        loadRealtimeRequest = (LoadRealtimeRequest) LoadRealtimeRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(loadRealtimeRequest, com.google.android.gms.drive.internal.o.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 28:
                    SetResourceParentsRequest setResourceParentsRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        setResourceParentsRequest = (SetResourceParentsRequest) SetResourceParentsRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(setResourceParentsRequest, com.google.android.gms.drive.internal.o.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 29:
                    GetDriveIdFromUniqueIdentifierRequest getDriveIdFromUniqueIdentifierRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        getDriveIdFromUniqueIdentifierRequest = (GetDriveIdFromUniqueIdentifierRequest) GetDriveIdFromUniqueIdentifierRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(getDriveIdFromUniqueIdentifierRequest, com.google.android.gms.drive.internal.o.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 30:
                    CheckResourceIdsExistRequest checkResourceIdsExistRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        checkResourceIdsExistRequest = (CheckResourceIdsExistRequest) CheckResourceIdsExistRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(checkResourceIdsExistRequest, com.google.android.gms.drive.internal.o.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 31:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    b(com.google.android.gms.drive.internal.o.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 32:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    c(com.google.android.gms.drive.internal.o.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 33:
                    SetPinnedDownloadPreferencesRequest setPinnedDownloadPreferencesRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        setPinnedDownloadPreferencesRequest = (SetPinnedDownloadPreferencesRequest) SetPinnedDownloadPreferencesRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(setPinnedDownloadPreferencesRequest, com.google.android.gms.drive.internal.o.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 34:
                    RealtimeDocumentSyncRequest realtimeDocumentSyncRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        realtimeDocumentSyncRequest = (RealtimeDocumentSyncRequest) RealtimeDocumentSyncRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(realtimeDocumentSyncRequest, com.google.android.gms.drive.internal.o.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 35:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    d(com.google.android.gms.drive.internal.o.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 36:
                    SetFileUploadPreferencesRequest setFileUploadPreferencesRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        setFileUploadPreferencesRequest = (SetFileUploadPreferencesRequest) SetFileUploadPreferencesRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(setFileUploadPreferencesRequest, com.google.android.gms.drive.internal.o.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 37:
                    CancelPendingActionsRequest cancelPendingActionsRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        cancelPendingActionsRequest = (CancelPendingActionsRequest) CancelPendingActionsRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(cancelPendingActionsRequest, com.google.android.gms.drive.internal.o.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 38:
                    UntrashResourceRequest untrashResourceRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        untrashResourceRequest = (UntrashResourceRequest) UntrashResourceRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(untrashResourceRequest, com.google.android.gms.drive.internal.o.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 41:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    e(com.google.android.gms.drive.internal.o.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 42:
                    FetchThumbnailRequest fetchThumbnailRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        fetchThumbnailRequest = (FetchThumbnailRequest) FetchThumbnailRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(fetchThumbnailRequest, com.google.android.gms.drive.internal.o.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 43:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    f(com.google.android.gms.drive.internal.o.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 44:
                    GetChangesRequest getChangesRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        getChangesRequest = (GetChangesRequest) GetChangesRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(getChangesRequest, com.google.android.gms.drive.internal.o.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 46:
                    UnsubscribeResourceRequest unsubscribeResourceRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        unsubscribeResourceRequest = (UnsubscribeResourceRequest) UnsubscribeResourceRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(unsubscribeResourceRequest, com.google.android.gms.drive.internal.o.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 47:
                    GetPermissionsRequest getPermissionsRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        getPermissionsRequest = (GetPermissionsRequest) GetPermissionsRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(getPermissionsRequest, com.google.android.gms.drive.internal.o.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 48:
                    AddPermissionRequest addPermissionRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        addPermissionRequest = (AddPermissionRequest) AddPermissionRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(addPermissionRequest, com.google.android.gms.drive.internal.o.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 49:
                    UpdatePermissionRequest updatePermissionRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        updatePermissionRequest = (UpdatePermissionRequest) UpdatePermissionRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(updatePermissionRequest, com.google.android.gms.drive.internal.o.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 50:
                    RemovePermissionRequest removePermissionRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        removePermissionRequest = (RemovePermissionRequest) RemovePermissionRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(removePermissionRequest, com.google.android.gms.drive.internal.o.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 51:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        queryRequest = (QueryRequest) QueryRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(queryRequest, com.google.android.gms.drive.internal.p.a.a(parcel.readStrongBinder()), com.google.android.gms.drive.internal.o.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 52:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    a(com.google.android.gms.drive.internal.p.a.a(parcel.readStrongBinder()), com.google.android.gms.drive.internal.o.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 53:
                    ControlProgressRequest controlProgressRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        controlProgressRequest = (ControlProgressRequest) ControlProgressRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(controlProgressRequest, com.google.android.gms.drive.internal.o.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 54:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    g(com.google.android.gms.drive.internal.o.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 55:
                    ChangeResourceParentsRequest changeResourceParentsRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        changeResourceParentsRequest = (ChangeResourceParentsRequest) ChangeResourceParentsRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(changeResourceParentsRequest, com.google.android.gms.drive.internal.o.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 56:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        streamContentsRequest = (StreamContentsRequest) StreamContentsRequest.CREATOR.createFromParcel(parcel);
                    }
                    a = a(streamContentsRequest, com.google.android.gms.drive.internal.o.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    if (a != null) {
                        parcel2.writeInt(1);
                        a.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 57:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    h(com.google.android.gms.drive.internal.o.a.a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.drive.internal.IDriveService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    IntentSender a(CreateFileIntentSenderRequest createFileIntentSenderRequest);

    IntentSender a(OpenFileIntentSenderRequest openFileIntentSenderRequest);

    DriveServiceResponse a(OpenContentsRequest openContentsRequest, o oVar);

    DriveServiceResponse a(StreamContentsRequest streamContentsRequest, o oVar);

    void a(RealtimeDocumentSyncRequest realtimeDocumentSyncRequest, o oVar);

    void a(AddEventListenerRequest addEventListenerRequest, p pVar, String str, o oVar);

    void a(AddPermissionRequest addPermissionRequest, o oVar);

    void a(AuthorizeAccessRequest authorizeAccessRequest, o oVar);

    void a(CancelPendingActionsRequest cancelPendingActionsRequest, o oVar);

    void a(ChangeResourceParentsRequest changeResourceParentsRequest, o oVar);

    void a(CheckResourceIdsExistRequest checkResourceIdsExistRequest, o oVar);

    void a(CloseContentsAndUpdateMetadataRequest closeContentsAndUpdateMetadataRequest, o oVar);

    void a(CloseContentsRequest closeContentsRequest, o oVar);

    void a(ControlProgressRequest controlProgressRequest, o oVar);

    void a(CreateContentsRequest createContentsRequest, o oVar);

    void a(CreateFileRequest createFileRequest, o oVar);

    void a(CreateFolderRequest createFolderRequest, o oVar);

    void a(DeleteResourceRequest deleteResourceRequest, o oVar);

    void a(DisconnectRequest disconnectRequest);

    void a(FetchThumbnailRequest fetchThumbnailRequest, o oVar);

    void a(GetChangesRequest getChangesRequest, o oVar);

    void a(GetDriveIdFromUniqueIdentifierRequest getDriveIdFromUniqueIdentifierRequest, o oVar);

    void a(GetMetadataRequest getMetadataRequest, o oVar);

    void a(GetPermissionsRequest getPermissionsRequest, o oVar);

    void a(ListParentsRequest listParentsRequest, o oVar);

    void a(LoadRealtimeRequest loadRealtimeRequest, o oVar);

    void a(QueryRequest queryRequest, o oVar);

    void a(QueryRequest queryRequest, p pVar, o oVar);

    void a(RemoveEventListenerRequest removeEventListenerRequest, p pVar, String str, o oVar);

    void a(RemovePermissionRequest removePermissionRequest, o oVar);

    void a(SetFileUploadPreferencesRequest setFileUploadPreferencesRequest, o oVar);

    void a(SetPinnedDownloadPreferencesRequest setPinnedDownloadPreferencesRequest, o oVar);

    void a(SetResourceParentsRequest setResourceParentsRequest, o oVar);

    void a(TrashResourceRequest trashResourceRequest, o oVar);

    void a(UnsubscribeResourceRequest unsubscribeResourceRequest, o oVar);

    void a(UntrashResourceRequest untrashResourceRequest, o oVar);

    void a(UpdateMetadataRequest updateMetadataRequest, o oVar);

    void a(UpdatePermissionRequest updatePermissionRequest, o oVar);

    void a(o oVar);

    void a(p pVar, o oVar);

    void b(QueryRequest queryRequest, o oVar);

    void b(o oVar);

    void c(o oVar);

    void d(o oVar);

    void e(o oVar);

    void f(o oVar);

    void g(o oVar);

    void h(o oVar);
}
