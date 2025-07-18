CREATE TABLE wishlists
(
    product_id BIGINT NOT NULL,
    user_id    BIGINT NOT NULL,
    CONSTRAINT pk_wishlists PRIMARY KEY (product_id, user_id)
);

ALTER TABLE wishlists
    ADD CONSTRAINT fk_wishlists_on_product FOREIGN KEY (product_id) REFERENCES products (id);

ALTER TABLE wishlists
    ADD CONSTRAINT fk_wishlists_on_user FOREIGN KEY (user_id) REFERENCES users (id);