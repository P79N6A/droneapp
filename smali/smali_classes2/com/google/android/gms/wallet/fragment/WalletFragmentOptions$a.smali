.class public final Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions$a;->a:Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions$a;-><init>(Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;)V

    return-void
.end method


# virtual methods
.method public a(I)Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions$a;->a:Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;

    invoke-static {v0, p1}, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->a(Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;I)I

    return-object p0
.end method

.method public a(Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;)Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions$a;->a:Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;

    invoke-static {v0, p1}, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->a(Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;)Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;

    return-object p0
.end method

.method public a()Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions$a;->a:Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;

    return-object v0
.end method

.method public b(I)Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions$a;->a:Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;

    invoke-static {v0, p1}, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->b(Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;I)I

    return-object p0
.end method

.method public c(I)Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions$a;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions$a;->a:Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;

    new-instance v1, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;

    invoke-direct {v1}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;-><init>()V

    invoke-virtual {v1, p1}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->a(I)Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->a(Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;)Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;

    return-object p0
.end method

.method public d(I)Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions$a;->a:Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;

    invoke-static {v0, p1}, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->c(Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;I)I

    return-object p0
.end method
