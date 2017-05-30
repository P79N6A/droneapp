.class public Lcom/fimi/soul/live/NativeAudiolive;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fimi/soul/live/NativeAudiolive$LiveCallBackListener;
    }
.end annotation


# static fields
.field public static final FM_LIVE_PUSHING:I = 0xaaab

.field public static final FM_LIVE_PUSH_EXIT:I = 0x4c5001

.field public static final FM_LIVE_PUSH_FORMAT_ERROR:I = 0x4c5003

.field public static final FM_LIVE_PUSH_NET_BLOCKS:I = 0x4c5005

.field public static final FM_LIVE_PUSH_OK:I = 0x4c5007

.field public static final FM_LIVE_PUSH_RUNNIG:I = 0x4c5006

.field public static final FM_LIVE_VIDEO_DISCONNECTED:I = 0x4c5604

.field public static final FM_LIVE_VIDEO_EXIT:I = 0x4c5601

.field public static final FM_LIVE_VIDEO_FORMAT_ERROR:I = 0x4c5603

.field public static final FM_LIVE_VIDEO_SYS_FAILED:I = 0x4c5602


# instance fields
.field private final FM_LIVE_AUDIO_BUSY_DEV:I

.field private final FM_LIVE_AUDIO_EXIT:I

.field private final FM_LIVE_PUSH_DISCONNECTED:I

.field private final FM_LIVE_PUSH_SYS_FAILED:I

.field handler:Landroid/os/Handler;

.field liveCallBackListener:Lcom/fimi/soul/live/NativeAudiolive$LiveCallBackListener;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "fmlive"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x4c4101

    iput v0, p0, Lcom/fimi/soul/live/NativeAudiolive;->FM_LIVE_AUDIO_EXIT:I

    const v0, 0x4c4102

    iput v0, p0, Lcom/fimi/soul/live/NativeAudiolive;->FM_LIVE_AUDIO_BUSY_DEV:I

    const v0, 0x4c5002

    iput v0, p0, Lcom/fimi/soul/live/NativeAudiolive;->FM_LIVE_PUSH_SYS_FAILED:I

    const v0, 0x4c5004

    iput v0, p0, Lcom/fimi/soul/live/NativeAudiolive;->FM_LIVE_PUSH_DISCONNECTED:I

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0, p0}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/fimi/soul/live/NativeAudiolive;->handler:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public callBack(III)V
    .locals 3

    const-string v0, "FM"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "msg="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "FM"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "arg1="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "FM"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "arg2="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    sparse-switch p1, :sswitch_data_0

    :goto_0
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    iput p1, v1, Landroid/os/Message;->arg1:I

    iget-object v0, p0, Lcom/fimi/soul/live/NativeAudiolive;->handler:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    :sswitch_0
    return-void

    :sswitch_1
    const v0, 0x7f0a0275

    goto :goto_0

    :sswitch_2
    const v0, 0x7f0a0274

    goto :goto_0

    :sswitch_3
    const v0, 0x7f0a0280

    goto :goto_0

    :sswitch_4
    const v0, 0x7f0a0282

    goto :goto_0

    :sswitch_5
    const v0, 0x7f0a0281

    goto :goto_0

    :sswitch_6
    const v0, 0x7f0a027f

    goto :goto_0

    :sswitch_7
    const v0, 0x7f0a0278

    goto :goto_0

    :sswitch_8
    const v0, 0x7f0a027d

    goto :goto_0

    :sswitch_9
    const v0, 0x7f0a0279

    goto :goto_0

    :sswitch_a
    const v0, 0x7f0a0277

    goto :goto_0

    :sswitch_b
    const v0, 0x7f0a027a

    goto :goto_0

    :sswitch_c
    const v0, 0x7f0a027b

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0x4c4101 -> :sswitch_1
        0x4c4102 -> :sswitch_2
        0x4c5001 -> :sswitch_7
        0x4c5002 -> :sswitch_8
        0x4c5003 -> :sswitch_9
        0x4c5004 -> :sswitch_a
        0x4c5005 -> :sswitch_b
        0x4c5006 -> :sswitch_0
        0x4c5007 -> :sswitch_c
        0x4c5601 -> :sswitch_3
        0x4c5602 -> :sswitch_4
        0x4c5603 -> :sswitch_5
        0x4c5604 -> :sswitch_6
    .end sparse-switch
.end method

.method public native fmLiveGetStatus()I
.end method

.method public native fmLiveStart(Ljava/lang/String;Ljava/lang/String;)I
.end method

.method public native fmLiveStop()I
.end method

.method public getLiveCallBackListener()Lcom/fimi/soul/live/NativeAudiolive$LiveCallBackListener;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/live/NativeAudiolive;->liveCallBackListener:Lcom/fimi/soul/live/NativeAudiolive$LiveCallBackListener;

    return-object v0
.end method

.method public handleMessage(Landroid/os/Message;)Z
    .locals 3

    iget-object v0, p0, Lcom/fimi/soul/live/NativeAudiolive;->liveCallBackListener:Lcom/fimi/soul/live/NativeAudiolive$LiveCallBackListener;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/fimi/soul/live/NativeAudiolive;->liveCallBackListener:Lcom/fimi/soul/live/NativeAudiolive$LiveCallBackListener;

    iget v2, p1, Landroid/os/Message;->arg1:I

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-interface {v1, v2, v0}, Lcom/fimi/soul/live/NativeAudiolive$LiveCallBackListener;->liveCallResult(II)Ljava/lang/String;

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isLivePushing()Z
    .locals 2

    invoke-virtual {p0}, Lcom/fimi/soul/live/NativeAudiolive;->fmLiveGetStatus()I

    move-result v0

    const v1, 0xaaab

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public setLiveCallBackListener(Lcom/fimi/soul/live/NativeAudiolive$LiveCallBackListener;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/live/NativeAudiolive;->liveCallBackListener:Lcom/fimi/soul/live/NativeAudiolive$LiveCallBackListener;

    return-void
.end method
