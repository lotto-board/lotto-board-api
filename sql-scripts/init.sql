CREATE TABLE IF NOT EXISTS lotto.shop
(
    name               varchar(255) not null,
    location           varchar(255) not null,
    first_prize_count  int          null,
    second_prize_count int          null,
    constraint table_name_pk
        primary key (name, location)
);


INSERT INTO lotto.shop (name,
                        location,
                        first_prize_count,
                        second_prize_count)
VALUES ('백송마트', '광주 광산구 월계로 110 104호', 1, 1);

