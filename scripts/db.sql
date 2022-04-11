create table film(
	filmid bigserial primary key, 
	adi varchar(100) not null,
	kategorisi varchar(100) not null, 
	cikis_tarihi varchar(100) not null,
	suresi varchar(100) not null,
	ulke varchar(100) not null,
	film_puani numeric,
	yas_siniri varchar(50) not null,
	hasilat varchar(100) not null,
	fa TEXT
);



create table kategori(
    kategori_id serial primary key,
    kategoriadi varchar(100) not null
);



create table photos(
	photos_id bigserial primary key,
	filmid bigserial references film(filmid),
	fo TEXT not null

);



create table kullanıcılar(
	kullanıcı_id bigserial primary key,
	kullanıcıadı varchar(200) not null,
	ad varchar(100) not null,
	soyad varchar(100) not null,
	eposta varchar(150) not null,
	sifre TEXT not null
);




create table yorumlar(
	yorumid bigserial primary key,
	kullanıcı_id bigserial references kullanıcılar(kullanıcı_id),
	filmid bigserial references film(filmid),
	yorum TEXT,
	tarih date not null default current_timestamp
);




create table sss(
	sss_id serial primary key,
	soru TEXT not null,
	cevap TEXT not null


);



create table iletişim_form(
	iletişim_formid bigserial primary key,
	ad varchar(100) not null,
	soyad varchar(100) not null,
	mail varchar(100) not null,
	başlık varchar(100) not null,
	mesaj TEXT not null

);



create table log_kayıtları(
	log_id bigserial primary key,
	kullanıcı_id bigserial references kullanıcılar(kullanıcı_id),
	hareket TEXT,
	ip TEXT,
	tarih date not null default current_timestamp


);










