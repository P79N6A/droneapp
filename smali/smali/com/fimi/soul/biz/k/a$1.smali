.class Lcom/fimi/soul/biz/k/a$1;
.super Landroid/os/Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fimi/soul/biz/k/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/biz/k/a;


# direct methods
.method constructor <init>(Lcom/fimi/soul/biz/k/a;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/biz/k/a$1;->a:Lcom/fimi/soul/biz/k/a;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 8

    const-wide v2, 0x40d3880000000000L    # 20000.0

    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x64

    if-ne v0, v1, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/fimi/soul/biz/k/a$1;->a:Lcom/fimi/soul/biz/k/a;

    invoke-static {v0}, Lcom/fimi/soul/biz/k/a;->a(Lcom/fimi/soul/biz/k/a;)Lcom/google/android/gms/maps/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/maps/c;->a()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object v0

    iget v0, v0, Lcom/google/android/gms/maps/model/CameraPosition;->b:F

    const/high16 v1, 0x41200000    # 10.0f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/biz/k/a$1;->a:Lcom/fimi/soul/biz/k/a;

    invoke-static {v0}, Lcom/fimi/soul/biz/k/a;->b(Lcom/fimi/soul/biz/k/a;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/model/c;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/c;->a()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    return-void

    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/fimi/soul/biz/k/a$1;->a:Lcom/fimi/soul/biz/k/a;

    invoke-static {v0}, Lcom/fimi/soul/biz/k/a;->b(Lcom/fimi/soul/biz/k/a;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/fimi/soul/biz/k/a$1;->a:Lcom/fimi/soul/biz/k/a;

    iget-object v0, v0, Lcom/fimi/soul/biz/k/a;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    :cond_2
    new-instance v0, Landroid/graphics/Point;

    const/4 v1, 0x0

    const/4 v4, 0x0

    invoke-direct {v0, v1, v4}, Landroid/graphics/Point;-><init>(II)V

    iget-object v1, p0, Lcom/fimi/soul/biz/k/a$1;->a:Lcom/fimi/soul/biz/k/a;

    invoke-static {v1}, Lcom/fimi/soul/biz/k/a;->a(Lcom/fimi/soul/biz/k/a;)Lcom/google/android/gms/maps/c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/maps/c;->n()Lcom/google/android/gms/maps/h;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/maps/h;->a(Landroid/graphics/Point;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/biz/k/a$1;->a:Lcom/fimi/soul/biz/k/a;

    invoke-static {v1}, Lcom/fimi/soul/biz/k/a;->a(Lcom/fimi/soul/biz/k/a;)Lcom/google/android/gms/maps/c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/maps/c;->a()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object v1

    iget-object v4, v1, Lcom/google/android/gms/maps/model/CameraPosition;->a:Lcom/google/android/gms/maps/model/LatLng;

    if-eqz v4, :cond_0

    invoke-static {v0, v4}, Lcom/fimi/soul/utils/y;->c(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)Lcom/fimi/soul/utils/ag;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/utils/ag;->a()D

    move-result-wide v0

    cmpg-double v5, v0, v2

    if-gez v5, :cond_3

    move-wide v0, v2

    :cond_3
    const-wide v2, 0x40fb198000000000L    # 111000.0

    div-double/2addr v0, v2

    iget-object v2, p0, Lcom/fimi/soul/biz/k/a$1;->a:Lcom/fimi/soul/biz/k/a;

    invoke-static {v2}, Lcom/fimi/soul/biz/k/a;->c(Lcom/fimi/soul/biz/k/a;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2

    if-eqz v2, :cond_5

    iget-object v2, p0, Lcom/fimi/soul/biz/k/a$1;->a:Lcom/fimi/soul/biz/k/a;

    invoke-static {v2}, Lcom/fimi/soul/biz/k/a;->c(Lcom/fimi/soul/biz/k/a;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "SELECT LAT,LON,CLASS from dmz_tb where LAT > "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-wide v6, v4, Lcom/google/android/gms/maps/model/LatLng;->a:D

    sub-double/2addr v6, v0

    invoke-virtual {v3, v6, v7}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v5, " and LAT <"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-wide v6, v4, Lcom/google/android/gms/maps/model/LatLng;->a:D

    add-double/2addr v6, v0

    invoke-virtual {v3, v6, v7}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v5, " and LON >"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-wide v6, v4, Lcom/google/android/gms/maps/model/LatLng;->b:D

    sub-double/2addr v6, v0

    invoke-virtual {v3, v6, v7}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v5, " and LON < "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-wide v4, v4, Lcom/google/android/gms/maps/model/LatLng;->b:D

    add-double/2addr v0, v4

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-interface {v0}, Landroid/database/Cursor;->getCount()I

    move-result v1

    if-lez v1, :cond_4

    :goto_1
    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v1

    if-eqz v1, :cond_4

    const-string v1, "LAT"

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getFloat(I)F

    move-result v1

    float-to-double v2, v1

    const-string v1, "LON"

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getFloat(I)F

    move-result v1

    float-to-double v4, v1

    const-string v1, "CLASS"

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    int-to-byte v1, v1

    and-int/lit8 v6, v1, 0x3

    and-int/lit8 v1, v1, 0x3f

    add-int/lit8 v1, v1, 0x1

    mul-int/lit16 v1, v1, 0x3e8

    new-instance v6, Lcom/google/android/gms/maps/model/LatLng;

    invoke-direct {v6, v2, v3, v4, v5}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    iget-object v2, p0, Lcom/fimi/soul/biz/k/a$1;->a:Lcom/fimi/soul/biz/k/a;

    iget-object v3, p0, Lcom/fimi/soul/biz/k/a$1;->a:Lcom/fimi/soul/biz/k/a;

    invoke-static {v3}, Lcom/fimi/soul/biz/k/a;->d(Lcom/fimi/soul/biz/k/a;)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v3

    invoke-static {v2, v6, v1, v3}, Lcom/fimi/soul/biz/k/a;->a(Lcom/fimi/soul/biz/k/a;Lcom/google/android/gms/maps/model/LatLng;ILcom/google/android/gms/maps/model/CircleOptions;)V

    goto :goto_1

    :cond_4
    if-eqz v0, :cond_5

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    :cond_5
    iget-object v0, p0, Lcom/fimi/soul/biz/k/a$1;->a:Lcom/fimi/soul/biz/k/a;

    invoke-static {v0}, Lcom/fimi/soul/biz/k/a;->e(Lcom/fimi/soul/biz/k/a;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/k/a$1;->a:Lcom/fimi/soul/biz/k/a;

    invoke-static {v0}, Lcom/fimi/soul/biz/k/a;->e(Lcom/fimi/soul/biz/k/a;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/k/a$1;->a:Lcom/fimi/soul/biz/k/a;

    invoke-static {v0}, Lcom/fimi/soul/biz/k/a;->e(Lcom/fimi/soul/biz/k/a;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/DynamicDYZ_Entity;

    new-instance v2, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v0}, Lcom/fimi/soul/entity/DynamicDYZ_Entity;->getLatitude()D

    move-result-wide v4

    invoke-virtual {v0}, Lcom/fimi/soul/entity/DynamicDYZ_Entity;->getLogitude()D

    move-result-wide v6

    invoke-direct {v2, v4, v5, v6, v7}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    iget-object v3, p0, Lcom/fimi/soul/biz/k/a$1;->a:Lcom/fimi/soul/biz/k/a;

    invoke-virtual {v0}, Lcom/fimi/soul/entity/DynamicDYZ_Entity;->getRadius()I

    move-result v0

    iget-object v4, p0, Lcom/fimi/soul/biz/k/a$1;->a:Lcom/fimi/soul/biz/k/a;

    invoke-static {v4}, Lcom/fimi/soul/biz/k/a;->f(Lcom/fimi/soul/biz/k/a;)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v4

    invoke-static {v3, v2, v0, v4}, Lcom/fimi/soul/biz/k/a;->a(Lcom/fimi/soul/biz/k/a;Lcom/google/android/gms/maps/model/LatLng;ILcom/google/android/gms/maps/model/CircleOptions;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2
.end method
