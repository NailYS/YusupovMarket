CREATE TABLE IF NOT EXISTS cart
(
    id    SERIAL NOT NULL
        CONSTRAINT cart_pkey PRIMARY KEY,
    name  varchar(256),
    count BIGINT,
    price float
);

CREATE TABLE IF NOT EXISTS shop
(
    id          SERIAL NOT NULL
        CONSTRAINT shop_pkey PRIMARY KEY,
    name        varchar(256),
    description varchar(256),
    owner       varchar(256),
    inn         varchar(256),
    address     varchar(256)
);
CREATE TABLE IF NOT EXISTS goods
(
    id      SERIAL NOT NULL
        CONSTRAINT goods_pkey PRIMARY KEY,
    shop_id BIGINT,
    name    varchar(256),
    count   BIGINT,
    price   float,
    FOREIGN KEY (shop_id) references shop (id)
);
