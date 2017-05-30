.class public Lcom/fimi/soul/entity/DynamicDYZ_Entity;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private encryptKey:Ljava/lang/String;

.field private encryptValue:Ljava/lang/String;

.field private endDate:J

.field private id:I

.field private insertDate:J

.field private latitude:D

.field private logitude:D

.field private radius:I

.field private remarks:Ljava/lang/String;

.field private startDate:J

.field private status:I

.field private type:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getEncryptKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/entity/DynamicDYZ_Entity;->encryptKey:Ljava/lang/String;

    return-object v0
.end method

.method public getEncryptValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/entity/DynamicDYZ_Entity;->encryptValue:Ljava/lang/String;

    return-object v0
.end method

.method public getEndDate()J
    .locals 2

    iget-wide v0, p0, Lcom/fimi/soul/entity/DynamicDYZ_Entity;->endDate:J

    return-wide v0
.end method

.method public getId()I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/entity/DynamicDYZ_Entity;->id:I

    return v0
.end method

.method public getInsertDate()J
    .locals 2

    iget-wide v0, p0, Lcom/fimi/soul/entity/DynamicDYZ_Entity;->insertDate:J

    return-wide v0
.end method

.method public getLatitude()D
    .locals 2

    iget-wide v0, p0, Lcom/fimi/soul/entity/DynamicDYZ_Entity;->latitude:D

    return-wide v0
.end method

.method public getLogitude()D
    .locals 2

    iget-wide v0, p0, Lcom/fimi/soul/entity/DynamicDYZ_Entity;->logitude:D

    return-wide v0
.end method

.method public getRadius()I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/entity/DynamicDYZ_Entity;->radius:I

    return v0
.end method

.method public getRemarks()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/entity/DynamicDYZ_Entity;->remarks:Ljava/lang/String;

    return-object v0
.end method

.method public getStartDate()J
    .locals 2

    iget-wide v0, p0, Lcom/fimi/soul/entity/DynamicDYZ_Entity;->startDate:J

    return-wide v0
.end method

.method public getStatus()I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/entity/DynamicDYZ_Entity;->status:I

    return v0
.end method

.method public getType()I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/entity/DynamicDYZ_Entity;->type:I

    return v0
.end method

.method public setEncryptKey(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/entity/DynamicDYZ_Entity;->encryptKey:Ljava/lang/String;

    return-void
.end method

.method public setEncryptValue(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/entity/DynamicDYZ_Entity;->encryptValue:Ljava/lang/String;

    return-void
.end method

.method public setEndDate(J)V
    .locals 1

    iput-wide p1, p0, Lcom/fimi/soul/entity/DynamicDYZ_Entity;->endDate:J

    return-void
.end method

.method public setId(I)V
    .locals 0

    iput p1, p0, Lcom/fimi/soul/entity/DynamicDYZ_Entity;->id:I

    return-void
.end method

.method public setInsertDate(J)V
    .locals 1

    iput-wide p1, p0, Lcom/fimi/soul/entity/DynamicDYZ_Entity;->insertDate:J

    return-void
.end method

.method public setLatitude(D)V
    .locals 1

    iput-wide p1, p0, Lcom/fimi/soul/entity/DynamicDYZ_Entity;->latitude:D

    return-void
.end method

.method public setLogitude(D)V
    .locals 1

    iput-wide p1, p0, Lcom/fimi/soul/entity/DynamicDYZ_Entity;->logitude:D

    return-void
.end method

.method public setRadius(I)V
    .locals 0

    iput p1, p0, Lcom/fimi/soul/entity/DynamicDYZ_Entity;->radius:I

    return-void
.end method

.method public setRemarks(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/entity/DynamicDYZ_Entity;->remarks:Ljava/lang/String;

    return-void
.end method

.method public setStartDate(J)V
    .locals 1

    iput-wide p1, p0, Lcom/fimi/soul/entity/DynamicDYZ_Entity;->startDate:J

    return-void
.end method

.method public setStatus(I)V
    .locals 0

    iput p1, p0, Lcom/fimi/soul/entity/DynamicDYZ_Entity;->status:I

    return-void
.end method

.method public setType(I)V
    .locals 0

    iput p1, p0, Lcom/fimi/soul/entity/DynamicDYZ_Entity;->type:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    const/16 v4, 0x27

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DynamicDYZ_Entity{encryptValue=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/entity/DynamicDYZ_Entity;->encryptValue:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", logitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Lcom/fimi/soul/entity/DynamicDYZ_Entity;->logitude:D

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", endDate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Lcom/fimi/soul/entity/DynamicDYZ_Entity;->endDate:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", latitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Lcom/fimi/soul/entity/DynamicDYZ_Entity;->latitude:D

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", insertDate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Lcom/fimi/soul/entity/DynamicDYZ_Entity;->insertDate:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/fimi/soul/entity/DynamicDYZ_Entity;->id:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", radius="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/fimi/soul/entity/DynamicDYZ_Entity;->radius:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", encryptKey=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/entity/DynamicDYZ_Entity;->encryptKey:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/fimi/soul/entity/DynamicDYZ_Entity;->type:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", startDate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Lcom/fimi/soul/entity/DynamicDYZ_Entity;->startDate:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", status="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/fimi/soul/entity/DynamicDYZ_Entity;->status:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", remarks=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/entity/DynamicDYZ_Entity;->remarks:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
