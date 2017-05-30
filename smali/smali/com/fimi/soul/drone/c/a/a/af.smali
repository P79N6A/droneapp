.class public Lcom/fimi/soul/drone/c/a/a/af;
.super Lcom/fimi/soul/drone/c/a/b;


# static fields
.field public static final b:I = 0xc6

.field public static final c:I = 0xa

.field private static final serialVersionUID:J = 0xc6L


# instance fields
.field public d:S

.field public e:S

.field public f:S

.field public g:S

.field public h:S

.field public i:Lcom/fimi/soul/drone/c/a/c;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/fimi/soul/drone/c/a/b;-><init>()V

    const/16 v0, 0xc6

    iput v0, p0, Lcom/fimi/soul/drone/c/a/a/af;->a:I

    return-void
.end method

.method public constructor <init>(Lcom/fimi/soul/drone/c/a/c;)V
    .locals 1

    invoke-direct {p0}, Lcom/fimi/soul/drone/c/a/b;-><init>()V

    const/16 v0, 0xc6

    iput v0, p0, Lcom/fimi/soul/drone/c/a/a/af;->a:I

    iput-object p1, p0, Lcom/fimi/soul/drone/c/a/a/af;->i:Lcom/fimi/soul/drone/c/a/c;

    iget-object v0, p1, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    invoke-virtual {p0, v0}, Lcom/fimi/soul/drone/c/a/a/af;->a(Lcom/fimi/soul/drone/c/a/d;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/fimi/soul/drone/c/a/c;
    .locals 3

    new-instance v0, Lcom/fimi/soul/drone/c/a/c;

    invoke-direct {v0}, Lcom/fimi/soul/drone/c/a/c;-><init>()V

    const/16 v1, 0xa

    iput v1, v0, Lcom/fimi/soul/drone/c/a/c;->b:I

    const/16 v1, 0xc6

    iput v1, v0, Lcom/fimi/soul/drone/c/a/c;->c:I

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    iget-short v2, p0, Lcom/fimi/soul/drone/c/a/a/af;->d:S

    invoke-virtual {v1, v2}, Lcom/fimi/soul/drone/c/a/d;->a(S)V

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    iget-short v2, p0, Lcom/fimi/soul/drone/c/a/a/af;->e:S

    invoke-virtual {v1, v2}, Lcom/fimi/soul/drone/c/a/d;->a(S)V

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    iget-short v2, p0, Lcom/fimi/soul/drone/c/a/a/af;->g:S

    invoke-virtual {v1, v2}, Lcom/fimi/soul/drone/c/a/d;->a(S)V

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    iget-short v2, p0, Lcom/fimi/soul/drone/c/a/a/af;->h:S

    invoke-virtual {v1, v2}, Lcom/fimi/soul/drone/c/a/d;->a(S)V

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    iget-short v2, p0, Lcom/fimi/soul/drone/c/a/a/af;->f:S

    invoke-virtual {v1, v2}, Lcom/fimi/soul/drone/c/a/d;->a(S)V

    return-object v0
.end method

.method public a(Lcom/fimi/soul/drone/c/a/d;)V
    .locals 1

    invoke-virtual {p1}, Lcom/fimi/soul/drone/c/a/d;->c()V

    invoke-virtual {p1}, Lcom/fimi/soul/drone/c/a/d;->e()S

    move-result v0

    iput-short v0, p0, Lcom/fimi/soul/drone/c/a/a/af;->d:S

    invoke-virtual {p1}, Lcom/fimi/soul/drone/c/a/d;->e()S

    move-result v0

    iput-short v0, p0, Lcom/fimi/soul/drone/c/a/a/af;->e:S

    invoke-virtual {p1}, Lcom/fimi/soul/drone/c/a/d;->e()S

    move-result v0

    iput-short v0, p0, Lcom/fimi/soul/drone/c/a/a/af;->g:S

    invoke-virtual {p1}, Lcom/fimi/soul/drone/c/a/d;->e()S

    move-result v0

    iput-short v0, p0, Lcom/fimi/soul/drone/c/a/a/af;->h:S

    invoke-virtual {p1}, Lcom/fimi/soul/drone/c/a/d;->e()S

    move-result v0

    iput-short v0, p0, Lcom/fimi/soul/drone/c/a/a/af;->f:S

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "msg_BatteryAnswerUplink [Battery_IDA="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-short v1, p0, Lcom/fimi/soul/drone/c/a/a/af;->d:S

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", Battery_IDB="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-short v1, p0, Lcom/fimi/soul/drone/c/a/a/af;->e:S

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", Cycle_count="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-short v1, p0, Lcom/fimi/soul/drone/c/a/a/af;->f:S

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", Design_capacity="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-short v1, p0, Lcom/fimi/soul/drone/c/a/a/af;->g:S

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", Full_charge_capacity="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-short v1, p0, Lcom/fimi/soul/drone/c/a/a/af;->h:S

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
