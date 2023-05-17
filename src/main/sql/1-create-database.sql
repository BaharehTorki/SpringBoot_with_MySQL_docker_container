create table user
(
    id    integer not null,
    email varchar(255),
    name
          varchar(255),
    primary key (id)
) engine = InnoDB;
create table user_seq
(
    next_val bigint
) engine = InnoDB;
insert into user_seq
values (1);

