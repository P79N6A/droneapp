.class public Lcom/fimi/soul/entity/UpdateVersonBean;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final SP_CAMERA_VERSION:Ljava/lang/String; = "sp_camera_version"

.field public static final SP_NEED_DOWN_FIRMWWARES:Ljava/lang/String; = "sp_need_down_firmwares"

.field public static final SP_RELAY_VERSION:Ljava/lang/String; = "sp_relay_version"

.field public static final SYSID_AP_CONTROL:I = 0x5

.field public static final SYSID_CAMERRA:I = 0x4

.field public static final SYSID_CLOUD_CONTROL:I = 0x3

.field public static final SYSID_FLY_CONTROL:I = 0x0

.field public static final SYSID_HAND_CONTROL:I = 0x1

.field public static final SYSID_RECEIVER_CONTROL:I = 0x2

.field public static final SYSID_RELAY:I = 0xb

.field public static final SYS_CLOUD_X:I = 0x6

.field public static final SYS_LIGHT_STREAM:I = 0x9

.field public static final SYS_SAFETY_ZONE:I = 0xa

.field public static final UPGRADE_FORCE:Ljava/lang/String; = "1"

.field public static final UPGRADE_FORCE_IGNORE_VERSION:Ljava/lang/String; = "2"

.field public static final UPGRADE_UNFORCE:Ljava/lang/String; = "0"


# instance fields
.field private adminid:I

.field private binKey:Ljava/lang/String;

.field private fieldNames:Ljava/lang/String;

.field private fileEncode:Ljava/lang/String;

.field private forceSign:Ljava/lang/String;

.field private id:I

.field private modelName:Ljava/lang/String;

.field private newVersion:Ljava/lang/String;

.field private pk:I

.field private preversion:Ljava/lang/String;

.field private size:Ljava/lang/String;

.field private sort:I

.field private status:Ljava/lang/String;

.field private sysid:I

.field private sysname:Ljava/lang/String;

.field private updcontents:Ljava/lang/String;

.field private uploadTime:Ljava/lang/String;

.field private url:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAdminid()I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/entity/UpdateVersonBean;->adminid:I

    return v0
.end method

.method public getBinKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/entity/UpdateVersonBean;->binKey:Ljava/lang/String;

    return-object v0
.end method

.method public getFieldNames()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/entity/UpdateVersonBean;->fieldNames:Ljava/lang/String;

    return-object v0
.end method

.method public getFileEncode()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/entity/UpdateVersonBean;->fileEncode:Ljava/lang/String;

    return-object v0
.end method

.method public getForceSign()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/entity/UpdateVersonBean;->forceSign:Ljava/lang/String;

    return-object v0
.end method

.method public getId()I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/entity/UpdateVersonBean;->id:I

    return v0
.end method

.method public getModelName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/entity/UpdateVersonBean;->modelName:Ljava/lang/String;

    return-object v0
.end method

.method public getNewVersion()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/entity/UpdateVersonBean;->newVersion:Ljava/lang/String;

    return-object v0
.end method

.method public getPk()I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/entity/UpdateVersonBean;->pk:I

    return v0
.end method

.method public getPreversion()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/entity/UpdateVersonBean;->preversion:Ljava/lang/String;

    return-object v0
.end method

.method public getSize()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/entity/UpdateVersonBean;->size:Ljava/lang/String;

    return-object v0
.end method

.method public getSort()I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/entity/UpdateVersonBean;->sort:I

    return v0
.end method

.method public getStatus()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/entity/UpdateVersonBean;->status:Ljava/lang/String;

    return-object v0
.end method

.method public getSysid()I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/entity/UpdateVersonBean;->sysid:I

    return v0
.end method

.method public getSysname()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/entity/UpdateVersonBean;->sysname:Ljava/lang/String;

    return-object v0
.end method

.method public getUpdcontents()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/entity/UpdateVersonBean;->updcontents:Ljava/lang/String;

    return-object v0
.end method

.method public getUploadTime()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/entity/UpdateVersonBean;->uploadTime:Ljava/lang/String;

    return-object v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/entity/UpdateVersonBean;->url:Ljava/lang/String;

    return-object v0
.end method

.method public setAdminid(I)V
    .locals 0

    iput p1, p0, Lcom/fimi/soul/entity/UpdateVersonBean;->adminid:I

    return-void
.end method

.method public setBinKey(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/entity/UpdateVersonBean;->binKey:Ljava/lang/String;

    return-void
.end method

.method public setFieldNames(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/entity/UpdateVersonBean;->fieldNames:Ljava/lang/String;

    return-void
.end method

.method public setFileEncode(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/entity/UpdateVersonBean;->fileEncode:Ljava/lang/String;

    return-void
.end method

.method public setForceSign(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/entity/UpdateVersonBean;->forceSign:Ljava/lang/String;

    return-void
.end method

.method public setId(I)V
    .locals 0

    iput p1, p0, Lcom/fimi/soul/entity/UpdateVersonBean;->id:I

    return-void
.end method

.method public setModelName(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/entity/UpdateVersonBean;->modelName:Ljava/lang/String;

    return-void
.end method

.method public setNewVersion(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/entity/UpdateVersonBean;->newVersion:Ljava/lang/String;

    return-void
.end method

.method public setPk(I)V
    .locals 0

    iput p1, p0, Lcom/fimi/soul/entity/UpdateVersonBean;->pk:I

    return-void
.end method

.method public setPreversion(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/entity/UpdateVersonBean;->preversion:Ljava/lang/String;

    return-void
.end method

.method public setSize(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/entity/UpdateVersonBean;->size:Ljava/lang/String;

    return-void
.end method

.method public setSort(I)V
    .locals 0

    iput p1, p0, Lcom/fimi/soul/entity/UpdateVersonBean;->sort:I

    return-void
.end method

.method public setStatus(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/entity/UpdateVersonBean;->status:Ljava/lang/String;

    return-void
.end method

.method public setSysid(I)V
    .locals 0

    iput p1, p0, Lcom/fimi/soul/entity/UpdateVersonBean;->sysid:I

    return-void
.end method

.method public setSysname(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/entity/UpdateVersonBean;->sysname:Ljava/lang/String;

    return-void
.end method

.method public setUpdcontents(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/entity/UpdateVersonBean;->updcontents:Ljava/lang/String;

    return-void
.end method

.method public setUploadTime(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/entity/UpdateVersonBean;->uploadTime:Ljava/lang/String;

    return-void
.end method

.method public setUrl(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/entity/UpdateVersonBean;->url:Ljava/lang/String;

    return-void
.end method
