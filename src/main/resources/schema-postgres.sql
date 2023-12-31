drop table if exists videojuego cascade;
drop table if exists distribuidor cascade;
drop table if exists desarrollador cascade;

create table videojuego (
    id serial primary key,
    nombre varchar(200) not null,
    descripcion varchar(3000),
    imagen_url varchar(500)
);

insert into videojuego
(nombre,                    descripcion,                                                                                                                                                                    imagen_url) values
('Bioshock Infinite',       'La última gran entrega de la saga Bioshock, ahora en una imperdible ciudad de ensueño entre las nubes.',                                                                       'https://cdn.vox-cdn.com/thumbor/I24jyQjEEDBM4AQrGIbaCk4t2gk=/0x0:1080x720/1200x800/filters:focal(0x0:1080x720)/cdn.vox-cdn.com/uploads/chorus_image/image/4674397/bioshock_infinite_delay.0.jpg'),
('Insurgency: Sandstorm',   'Un FPS táctico por equipos basado en combates letales en espacios reducidos y multijugador centrado en objetivos',                                                             'https://areajugones.sport.es/wp-content/uploads/2018/06/insurgency-e1528802800327.jpg'),
('The Witness',             'Te despiertas, a solas, en una extraña isla llena de puzles que te retarán y sorprenderán.',                                                                                   'https://cdn.wccftech.com/wp-content/uploads/2016/11/the-witness-ps4-pro-patch-4k-2060x1288.jpg'),
('Braid',                   'Un juego de rompecabezas con toques plataformeros, donde puedes manipular el flujo del tiempo de unas maneras inusuales y extrañas.',                                          'https://media.vandal.net/t200/11180/201373202453_1.jpg'),
('Borderlands 3',           '¡Vuelve el padre de los shooter-looter, con tropecientas mil armas y una aventura caótica!',                                                                                   'https://i.blogs.es/aa736f/borderlands-3_6/1366_2000.webp'),
('Control',                 'Tras la invasión de una agencia secreta de Nueva York por parte de una amenaza de otro mundo, te conviertes en la nueva directora que deberá luchar para recuperar Control.',  'https://media.playstation.com/is/image/SCEA/control-poster-01-ps4-us-11sep19?$native_nt$'),
('Subnautica',              'Un juego de aventuras submarinas ambientado en un mundo oceánico alienígena. ¡Te espera un mundo abierto enorme lleno de maravillas y peligros!',                              'https://store.playstation.com/store/api/chihiro/00_09_000/container/ES/es/999/EP5426-CUSA13893_00-2222444466669999/1568624921000/image?w=240&h=240&bg_color=000000&opacity=100&_version=00_09_000'),
('Firewatch',               'Firewatch es un juego de misterio en primera persona para un jugador que se desarrolla en la selva de Wyoming',                                                                'https://www.mobygames.com/images/covers/l/323028-firewatch-playstation-4-front-cover.jpg');

create table distribuidor (
    id serial primary key,
    nombre varchar(200) not null,
    sitio_web varchar(500)
);

insert into distribuidor
(nombre,                         sitio_web) values
('2K',                           'https://2k.com'),
('Focus Home Interactive',       'https://www.focus-home.com'),
('Thekla',                       null),
('Number One',                   null),
('505 Games',                    'https://505games.com'),
('Unknown Worlds Entertainment', 'https://unknownworlds.com'),
('Campo Santo',                  'https://www.camposanto.com');

alter table videojuego
add column distribuidor_id int,
add constraint fk_videojuego_distribuidor foreign key (distribuidor_id) references distribuidor(id);

update videojuego set distribuidor_id = 1 where id in (1, 5);
update videojuego set distribuidor_id = 2 where id in (2);
update videojuego set distribuidor_id = 3 where id in (3);
update videojuego set distribuidor_id = 4 where id in (4);
update videojuego set distribuidor_id = 5 where id in (6);
update videojuego set distribuidor_id = 6 where id in (7);
update videojuego set distribuidor_id = 7 where id in (8);

alter table videojuego
alter column distribuidor_id set not null;

create table desarrollador (
    id serial primary key,
    nombre varchar(200) not null
);

insert into desarrollador
(nombre) values
('Daniel'),
('Johanna'),
('Juan');

alter table videojuego
add column desarrollador_id int,
add constraint fk_videojuego_desarrollador foreign key (desarrollador_id) references desarrollador(id);

update videojuego set desarrollador_id = 1 where id in (1, 3, 5);
update videojuego set desarrollador_id = 2 where id in (2, 6, 7);
update videojuego set desarrollador_id = 3 where id in (4, 8);

alter table videojuego
alter column desarrollador_id set not null;
