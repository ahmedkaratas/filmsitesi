--
-- PostgreSQL database dump
--

-- Dumped from database version 14.2
-- Dumped by pg_dump version 14.2

-- Started on 2022-06-02 00:46:05

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

DROP DATABASE denemee3;
--
-- TOC entry 3450 (class 1262 OID 49272)
-- Name: denemee3; Type: DATABASE; Schema: -; Owner: postgres
--

CREATE DATABASE denemee3 WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Turkish_Turkey.1252';


ALTER DATABASE denemee3 OWNER TO postgres;

\connect denemee3

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 227 (class 1259 OID 49586)
-- Name: document; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.document (
    id integer NOT NULL,
    path character varying,
    name character varying,
    type character varying
);


ALTER TABLE public.document OWNER TO postgres;

--
-- TOC entry 226 (class 1259 OID 49585)
-- Name: document_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.document_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.document_id_seq OWNER TO postgres;

--
-- TOC entry 3451 (class 0 OID 0)
-- Dependencies: 226
-- Name: document_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.document_id_seq OWNED BY public.document.id;


--
-- TOC entry 210 (class 1259 OID 49274)
-- Name: film; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.film (
    filmid bigint NOT NULL,
    ad text,
    tur text,
    vizyon text,
    sure text,
    ulke text,
    puan numeric,
    yassiniri text,
    filmlinki text,
    aciklama text,
    gorsel text,
    kategoriler character varying
);


ALTER TABLE public.film OWNER TO postgres;

--
-- TOC entry 209 (class 1259 OID 49273)
-- Name: film_filmid_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.film_filmid_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.film_filmid_seq OWNER TO postgres;

--
-- TOC entry 3452 (class 0 OID 0)
-- Dependencies: 209
-- Name: film_filmid_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.film_filmid_seq OWNED BY public.film.filmid;


--
-- TOC entry 235 (class 1259 OID 49672)
-- Name: filmkategori; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.filmkategori (
    id integer NOT NULL,
    film_id integer,
    kategori_id integer
);


ALTER TABLE public.filmkategori OWNER TO postgres;

--
-- TOC entry 234 (class 1259 OID 49671)
-- Name: filmkategori_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.filmkategori_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.filmkategori_id_seq OWNER TO postgres;

--
-- TOC entry 3453 (class 0 OID 0)
-- Dependencies: 234
-- Name: filmkategori_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.filmkategori_id_seq OWNED BY public.filmkategori.id;


--
-- TOC entry 217 (class 1259 OID 49497)
-- Name: fotograflar; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.fotograflar (
    id bigint NOT NULL,
    filmid bigint NOT NULL,
    linki text
);


ALTER TABLE public.fotograflar OWNER TO postgres;

--
-- TOC entry 216 (class 1259 OID 49496)
-- Name: fotograflar_filmid_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.fotograflar_filmid_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.fotograflar_filmid_seq OWNER TO postgres;

--
-- TOC entry 3454 (class 0 OID 0)
-- Dependencies: 216
-- Name: fotograflar_filmid_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.fotograflar_filmid_seq OWNED BY public.fotograflar.filmid;


--
-- TOC entry 215 (class 1259 OID 49495)
-- Name: fotograflar_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.fotograflar_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.fotograflar_id_seq OWNER TO postgres;

--
-- TOC entry 3455 (class 0 OID 0)
-- Dependencies: 215
-- Name: fotograflar_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.fotograflar_id_seq OWNED BY public.fotograflar.id;


--
-- TOC entry 214 (class 1259 OID 49487)
-- Name: iletisim; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.iletisim (
    id bigint NOT NULL,
    ad text,
    soyad text,
    eposta text,
    baslik text,
    mesaj text
);


ALTER TABLE public.iletisim OWNER TO postgres;

--
-- TOC entry 213 (class 1259 OID 49486)
-- Name: iletisim_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.iletisim_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.iletisim_id_seq OWNER TO postgres;

--
-- TOC entry 3456 (class 0 OID 0)
-- Dependencies: 213
-- Name: iletisim_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.iletisim_id_seq OWNED BY public.iletisim.id;


--
-- TOC entry 221 (class 1259 OID 49522)
-- Name: kategori; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.kategori (
    id integer NOT NULL,
    adi text
);


ALTER TABLE public.kategori OWNER TO postgres;

--
-- TOC entry 220 (class 1259 OID 49521)
-- Name: kategori_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.kategori_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.kategori_id_seq OWNER TO postgres;

--
-- TOC entry 3457 (class 0 OID 0)
-- Dependencies: 220
-- Name: kategori_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.kategori_id_seq OWNED BY public.kategori.id;


--
-- TOC entry 231 (class 1259 OID 49608)
-- Name: kullanicilar; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.kullanicilar (
    id bigint NOT NULL,
    kullaniciadi text,
    ad text,
    soyad text,
    eposta text,
    sifre text,
    ugroup integer NOT NULL
);


ALTER TABLE public.kullanicilar OWNER TO postgres;

--
-- TOC entry 230 (class 1259 OID 49607)
-- Name: kullanicilar_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.kullanicilar_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.kullanicilar_id_seq OWNER TO postgres;

--
-- TOC entry 3458 (class 0 OID 0)
-- Dependencies: 230
-- Name: kullanicilar_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.kullanicilar_id_seq OWNED BY public.kullanicilar.id;


--
-- TOC entry 219 (class 1259 OID 49512)
-- Name: loglar; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.loglar (
    id bigint NOT NULL,
    kullaniciadi text,
    hareket text,
    ip text,
    tarih date DEFAULT CURRENT_TIMESTAMP NOT NULL
);


ALTER TABLE public.loglar OWNER TO postgres;

--
-- TOC entry 218 (class 1259 OID 49511)
-- Name: loglar_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.loglar_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.loglar_id_seq OWNER TO postgres;

--
-- TOC entry 3459 (class 0 OID 0)
-- Dependencies: 218
-- Name: loglar_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.loglar_id_seq OWNED BY public.loglar.id;


--
-- TOC entry 233 (class 1259 OID 49626)
-- Name: privilege; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.privilege (
    id integer NOT NULL,
    sgroup integer NOT NULL,
    mname character varying(250) NOT NULL,
    icreate boolean DEFAULT false NOT NULL,
    iupdate boolean DEFAULT false NOT NULL,
    idelete boolean DEFAULT false NOT NULL,
    ilist boolean DEFAULT false NOT NULL,
    ishow boolean DEFAULT false NOT NULL,
    iread boolean DEFAULT false NOT NULL
);


ALTER TABLE public.privilege OWNER TO postgres;

--
-- TOC entry 232 (class 1259 OID 49625)
-- Name: privilege_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.privilege_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.privilege_id_seq OWNER TO postgres;

--
-- TOC entry 3460 (class 0 OID 0)
-- Dependencies: 232
-- Name: privilege_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.privilege_id_seq OWNED BY public.privilege.id;


--
-- TOC entry 212 (class 1259 OID 49469)
-- Name: sss; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.sss (
    soruid bigint NOT NULL,
    soru text,
    cevap text
);


ALTER TABLE public.sss OWNER TO postgres;

--
-- TOC entry 211 (class 1259 OID 49468)
-- Name: sss_soruid_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.sss_soruid_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.sss_soruid_seq OWNER TO postgres;

--
-- TOC entry 3461 (class 0 OID 0)
-- Dependencies: 211
-- Name: sss_soruid_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.sss_soruid_seq OWNED BY public.sss.soruid;


--
-- TOC entry 229 (class 1259 OID 49597)
-- Name: systemgroup; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.systemgroup (
    id integer NOT NULL,
    gname character varying(250) NOT NULL,
    created timestamp without time zone DEFAULT CURRENT_TIMESTAMP NOT NULL,
    updated timestamp without time zone DEFAULT CURRENT_TIMESTAMP NOT NULL
);


ALTER TABLE public.systemgroup OWNER TO postgres;

--
-- TOC entry 228 (class 1259 OID 49596)
-- Name: systemgroup_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.systemgroup_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.systemgroup_id_seq OWNER TO postgres;

--
-- TOC entry 3462 (class 0 OID 0)
-- Dependencies: 228
-- Name: systemgroup_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.systemgroup_id_seq OWNED BY public.systemgroup.id;


--
-- TOC entry 225 (class 1259 OID 49564)
-- Name: yorumlar; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.yorumlar (
    yorumid bigint NOT NULL,
    kullaniciid bigint NOT NULL,
    filmid bigint NOT NULL,
    yorum text,
    tarih date DEFAULT CURRENT_TIMESTAMP NOT NULL
);


ALTER TABLE public.yorumlar OWNER TO postgres;

--
-- TOC entry 224 (class 1259 OID 49563)
-- Name: yorumlar_filmid_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.yorumlar_filmid_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.yorumlar_filmid_seq OWNER TO postgres;

--
-- TOC entry 3463 (class 0 OID 0)
-- Dependencies: 224
-- Name: yorumlar_filmid_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.yorumlar_filmid_seq OWNED BY public.yorumlar.filmid;


--
-- TOC entry 223 (class 1259 OID 49562)
-- Name: yorumlar_kullaniciid_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.yorumlar_kullaniciid_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.yorumlar_kullaniciid_seq OWNER TO postgres;

--
-- TOC entry 3464 (class 0 OID 0)
-- Dependencies: 223
-- Name: yorumlar_kullaniciid_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.yorumlar_kullaniciid_seq OWNED BY public.yorumlar.kullaniciid;


--
-- TOC entry 222 (class 1259 OID 49561)
-- Name: yorumlar_yorumid_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.yorumlar_yorumid_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.yorumlar_yorumid_seq OWNER TO postgres;

--
-- TOC entry 3465 (class 0 OID 0)
-- Dependencies: 222
-- Name: yorumlar_yorumid_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.yorumlar_yorumid_seq OWNED BY public.yorumlar.yorumid;


--
-- TOC entry 3234 (class 2604 OID 49595)
-- Name: document id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.document ALTER COLUMN id SET DEFAULT nextval('public.document_id_seq'::regclass);


--
-- TOC entry 3222 (class 2604 OID 49277)
-- Name: film filmid; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.film ALTER COLUMN filmid SET DEFAULT nextval('public.film_filmid_seq'::regclass);


--
-- TOC entry 3246 (class 2604 OID 49675)
-- Name: filmkategori id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.filmkategori ALTER COLUMN id SET DEFAULT nextval('public.filmkategori_id_seq'::regclass);


--
-- TOC entry 3225 (class 2604 OID 49500)
-- Name: fotograflar id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.fotograflar ALTER COLUMN id SET DEFAULT nextval('public.fotograflar_id_seq'::regclass);


--
-- TOC entry 3226 (class 2604 OID 49501)
-- Name: fotograflar filmid; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.fotograflar ALTER COLUMN filmid SET DEFAULT nextval('public.fotograflar_filmid_seq'::regclass);


--
-- TOC entry 3224 (class 2604 OID 49490)
-- Name: iletisim id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.iletisim ALTER COLUMN id SET DEFAULT nextval('public.iletisim_id_seq'::regclass);


--
-- TOC entry 3229 (class 2604 OID 49525)
-- Name: kategori id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.kategori ALTER COLUMN id SET DEFAULT nextval('public.kategori_id_seq'::regclass);


--
-- TOC entry 3238 (class 2604 OID 49611)
-- Name: kullanicilar id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.kullanicilar ALTER COLUMN id SET DEFAULT nextval('public.kullanicilar_id_seq'::regclass);


--
-- TOC entry 3227 (class 2604 OID 49515)
-- Name: loglar id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.loglar ALTER COLUMN id SET DEFAULT nextval('public.loglar_id_seq'::regclass);


--
-- TOC entry 3239 (class 2604 OID 49629)
-- Name: privilege id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.privilege ALTER COLUMN id SET DEFAULT nextval('public.privilege_id_seq'::regclass);


--
-- TOC entry 3223 (class 2604 OID 49472)
-- Name: sss soruid; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.sss ALTER COLUMN soruid SET DEFAULT nextval('public.sss_soruid_seq'::regclass);


--
-- TOC entry 3235 (class 2604 OID 49600)
-- Name: systemgroup id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.systemgroup ALTER COLUMN id SET DEFAULT nextval('public.systemgroup_id_seq'::regclass);


--
-- TOC entry 3230 (class 2604 OID 49567)
-- Name: yorumlar yorumid; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.yorumlar ALTER COLUMN yorumid SET DEFAULT nextval('public.yorumlar_yorumid_seq'::regclass);


--
-- TOC entry 3231 (class 2604 OID 49568)
-- Name: yorumlar kullaniciid; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.yorumlar ALTER COLUMN kullaniciid SET DEFAULT nextval('public.yorumlar_kullaniciid_seq'::regclass);


--
-- TOC entry 3232 (class 2604 OID 49569)
-- Name: yorumlar filmid; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.yorumlar ALTER COLUMN filmid SET DEFAULT nextval('public.yorumlar_filmid_seq'::regclass);


--
-- TOC entry 3436 (class 0 OID 49586)
-- Dependencies: 227
-- Data for Name: document; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.document (id, path, name, type) VALUES (1, 'ss', 'ssada', 'sssassa');
INSERT INTO public.document (id, path, name, type) VALUES (2, '\Users\celal\upload', 'kriptoloji.pdf', 'application/pdf');
INSERT INTO public.document (id, path, name, type) VALUES (3, '\Users\celal\upload', 'DocumentDAo.txt', 'text/plain');
INSERT INTO public.document (id, path, name, type) VALUES (4, '\Users\celal\upload', 'Ekran AlÄ±ntÄ±sÄ±.PNG', 'image/png');
INSERT INTO public.document (id, path, name, type) VALUES (5, '\Users\celal\upload', 'commons-fileupload-1.4-src.zip', 'application/x-zip-compressed');
INSERT INTO public.document (id, path, name, type) VALUES (6, '\Users\celal\upload', 'Adobe.Acrobat.Reader.DC.Oyunindir.rar', 'application/octet-stream');
INSERT INTO public.document (id, path, name, type) VALUES (7, '\Users\celal\upload', 'download.jpg', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (8, '\Users\celal\upload', 'DocumentBean.txt', 'text/plain');
INSERT INTO public.document (id, path, name, type) VALUES (9, '\Users\celal\uploadYeni Metin Belgesi (7).txt', 'Yeni Metin Belgesi (7).txt', 'text/plain');
INSERT INTO public.document (id, path, name, type) VALUES (10, '\Users\celal\uploadYeni Metin Belgesi (2).txt', 'Yeni Metin Belgesi (2).txt', 'text/plain');
INSERT INTO public.document (id, path, name, type) VALUES (11, '\Users\celal\upload', 'Ekran Alıntısı.PNG', 'image/png');
INSERT INTO public.document (id, path, name, type) VALUES (12, '\Users\celal\upload', 'DocumentDAo.txt', 'text/plain');
INSERT INTO public.document (id, path, name, type) VALUES (13, '\Users\celal\upload', 'download.jpg', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (14, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets', 'imgEkran Alıntısı.PNG', 'image/png');
INSERT INTO public.document (id, path, name, type) VALUES (15, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imglove-death-and-robots-minimal-4k-ds.jpg', 'love-death-and-robots-minimal-4k-ds.jpg', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (16, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgindir (3).jfif', 'indir (3).jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (17, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgindir (5).jfif', 'indir (5).jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (18, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgindir.jfif', 'indir.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (19, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgindir (4).jfif', 'indir (4).jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (20, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgindir (2).jfif', 'indir (2).jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (21, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgindir (1).jfif', 'indir (1).jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (22, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgindir (6).jfif', 'indir (6).jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (23, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgimages.jfif', 'images.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (24, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imglicensed-image.jfif', 'licensed-image.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (25, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgimages (1).jfif', 'images (1).jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (26, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgimages (3).jfif', 'images (3).jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (27, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgimages (2).jfif', 'images (2).jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (28, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgbattle13.jfif', 'battle13.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (29, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgbattle2.jfif', 'battle2.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (30, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgbattle1.jfif', 'battle1.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (31, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgmx.jfif', 'mx.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (32, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgmx2.jfif', 'mx2.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (33, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgmx3.jfif', 'mx3.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (34, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgwarrior.jfif', 'warrior.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (35, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgwarrior2.jfif', 'warrior2.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (36, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgwarrior4.jfif', 'warrior4.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (37, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgbecky5.jfif', 'becky5.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (38, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgbecky2.jfif', 'becky2.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (39, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgbecky4.jfif', 'becky4.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (40, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgbizans1.jfif', 'bizans1.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (41, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgbizans2.jfif', 'bizans2.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (42, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgbizans5.jfif', 'bizans5.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (43, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgej1.jfif', 'ej1.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (44, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgej2.jfif', 'ej2.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (45, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgej3.jfif', 'ej3.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (46, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imguncharted.jfif', 'uncharted.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (47, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imguncharted2.jfif', 'uncharted2.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (48, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imguncharted3.jfif', 'uncharted3.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (49, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgbörü4.jfif', 'börü4.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (50, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgbörü15.jfif', 'börü15.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (51, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgbörü2.jfif', 'börü2.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (52, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgkeriz1.jfif', 'keriz1.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (53, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgkeriz2.jfif', 'keriz2.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (54, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgkeriz3.jfif', 'keriz3.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (55, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgpunish1.jfif', 'punish1.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (56, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgpunish2.jfif', 'punish2.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (57, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgpunish3.jfif', 'punish3.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (58, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgrevened1.jfif', 'revened1.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (59, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgrevened2.jfif', 'revened2.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (60, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgrevened3.jfif', 'revened3.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (61, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imghc.jfif', 'hc.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (62, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imghc1.jfif', 'hc1.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (63, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imghc2.jfif', 'hc2.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (64, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgscore.jfif', 'score.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (65, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgscore2.jfif', 'score2.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (66, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgscore3.jfif', 'score3.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (67, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgdağ1.jfif', 'dağ1.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (68, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgdağ2.jfif', 'dağ2.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (69, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgdağ3.jfif', 'dağ3.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (70, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgkü.jfif', 'kü.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (71, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgkü1.jfif', 'kü1.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (72, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgkü2.jfif', 'kü2.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (73, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgtutsak.jfif', 'tutsak.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (74, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgtutsak2.jfif', 'tutsak2.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (75, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgtutsak3.jfif', 'tutsak3.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (76, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgpre1.jfif', 'pre1.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (77, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgpre2.jfif', 'pre2.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (78, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgpre3.jfif', 'pre3.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (79, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgyasıdışı.jfif', 'yasıdışı.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (80, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgyasadışı2.jfif', 'yasadışı2.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (81, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgyasadışı3.jfif', 'yasadışı3.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (82, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgcd1.jfif', 'cd1.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (83, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgcd2.jfif', 'cd2.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (84, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgcd3.jfif', 'cd3.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (85, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgnarcos1.jfif', 'narcos1.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (86, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgnarcos2.jfif', 'narcos2.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (87, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgnarcos3.jfif', 'narcos3.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (88, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgtrans.jfif', 'trans.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (89, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgtrans3.jfif', 'trans3.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (90, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgtrans2.jfif', 'trans2.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (91, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgöldür.jfif', 'öldür.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (92, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgöldür2.jfif', 'öldür2.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (93, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgöldür3.jfif', 'öldür3.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (94, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgkoğuş1.jfif', 'koğuş1.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (95, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgkoğuş2.jfif', 'koğuş2.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (96, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imgkoğuş3.jfif', 'koğuş3.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (97, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imggç.jfif', 'gç.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (98, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imggç1.jfif', 'gç1.jfif', 'image/jpeg');
INSERT INTO public.document (id, path, name, type) VALUES (99, '\Users\celal\OneDrive\Belgeler\NetBeansProjects\filmsitesi\FilmSitesi\web\assets\imggç2.jfif', 'gç2.jfif', 'image/jpeg');


--
-- TOC entry 3419 (class 0 OID 49274)
-- Dependencies: 210
-- Data for Name: film; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.film (filmid, ad, tur, vizyon, sure, ulke, puan, yassiniri, filmlinki, aciklama, gorsel, kategoriler) VALUES (55, 'Ölümcül Dağ', 'Yabancı', '27 Ağustos 2011', '1:23:08', 'Birleşik Krallık', 3.5, '+13', 'https://www.youtube.com/embed/AdaBOCozfms', 'Gözlerden uzak bir dağ tepesindeki kurtarma operasyonu, esrarengiz ve kötü niyetli güçlere karşı verilen amansız bir mücadeleye dönüşür.', 'https://i.ytimg.com/vi/AdaBOCozfms/maxresdefault.jpg', NULL);
INSERT INTO public.film (filmid, ad, tur, vizyon, sure, ulke, puan, yassiniri, filmlinki, aciklama, gorsel, kategoriler) VALUES (47, 'Uncharted', 'Yabancı', '18 Şubat 2022', '1:48:17', 'ABD', 6.4, '+13', 'https://www.youtube.com/embed/aaw4Y4MHSSY', 'Uncharted, Art Marcum ve Matt Holloway tarafından yazılan, 2022 ABD yapımı aksiyon-macera filmidir. Aynı adı taşıdığı video oyun serisinden uyarlanan filmin yönetmenliğini Ruben Fleischer üstlenmiştir.', 'https://assets-prd.ignimgs.com/2022/02/11/1-1644616058638.jpg', NULL);
INSERT INTO public.film (filmid, ad, tur, vizyon, sure, ulke, puan, yassiniri, filmlinki, aciklama, gorsel, kategoriler) VALUES (48, 'Börü', 'Yabancı', '28 Şubat 2018', '2:05:55', 'Türkiye', 7.0, '+13', 'https://www.youtube.com/embed/GEF_NjBpdx4', 'Börü, Can Emre ve Cem Özüdurunun 2018 yılında yönettiği polisiye ve dram filmi.', 'https://cdnuploads.aa.com.tr/uploads/Contents/2018/12/27/thumbs_b_c_18bec7a4301e8c14ba1a1ad23f63a607.jpg', NULL);
INSERT INTO public.film (filmid, ad, tur, vizyon, sure, ulke, puan, yassiniri, filmlinki, aciklama, gorsel, kategoriler) VALUES (56, 'Karlar Ülkesi 2', 'Yabancı', '20 Kasım 2019', '1:10:27', 'ABD', 7.0, '+8', 'https://www.youtube.com/embed/J-GRkheKl5k', 'Karlar Ülkesi 2, Walt Disney Animation Studios tarafından üretilen Amerikan animasyonlu bir müzikal fantezi filmi.', 'https://iasbh.tmgrup.com.tr/32b60d/1200/627/0/0/1200/627?u=https://isbh.tmgrup.com.tr/sbh/2019/12/20/karlar-ulkesi-2-frozen-2-milyar-dolarlik-filmler-kulubune-girdi-1576845888187.jpg', NULL);
INSERT INTO public.film (filmid, ad, tur, vizyon, sure, ulke, puan, yassiniri, filmlinki, aciklama, gorsel, kategoriler) VALUES (42, 'Max Steel', 'Yabancı', '25 Ekim 2016', '1:22:31', 'Birleşik Krallık', 4.6, '+13', 'https://www.youtube.com/embed/8rDxAj8o-fQ', 'Max Steel, Dolphin Films ve Ingenious Media ile Playground Productions bölümü tarafından ortaklaşa üretilen Mattelin aynı adlı aksiyon figürü serisine dayanan 2016 süper kahraman filmidir.', 'https://neizledik.com/wp-content/uploads/2019/02/max-steel.jpg', NULL);
INSERT INTO public.film (filmid, ad, tur, vizyon, sure, ulke, puan, yassiniri, filmlinki, aciklama, gorsel, kategoriler) VALUES (41, 'Hafıza', 'Yabancı', '29 Nisan 2022 ', '1:26:34', 'ABD', 5.6, '+13', 'https://www.youtube.com/embed/p0KD8zyCywU', 'Memory, Dario Scardapanein senaryosundan Martin Campbell tarafından yönetilen, yakında çıkacak bir Amerikan aksiyon gerilim filmi. Jef Geeraertsin De Zaak Alzheimer adlı romanına dayanıyor ve romanın önceki uyarlaması olan Belçika filmi The Alzheimer Casein yeniden çevrimi.', 'https://www.kaanintavsiyesi.com/pictures/movies/975094/45/hafiza-rememory-780x439.jpg?v=9', NULL);
INSERT INTO public.film (filmid, ad, tur, vizyon, sure, ulke, puan, yassiniri, filmlinki, aciklama, gorsel, kategoriler) VALUES (50, 'Keriz', 'Yerli', '1985', '1:38:40', 'Türkiye', 6.5, '+13', 'https://www.youtube.com/embed/kVyvF84zEaA', 'Keriz, yönetmenliğini Kartal Tibetin ve yapımcılığını da Türker İnanoğlunun üstlendiği, 1985 yapımı bir Türk filmidir. Güldürü türündeki filmin başrollerini Kemal Sunal ve Perihan Savaş paylaşmıştır.', 'https://i.ytimg.com/vi/luvVp6aSLSo/maxresdefault.jpg', NULL);
INSERT INTO public.film (filmid, ad, tur, vizyon, sure, ulke, puan, yassiniri, filmlinki, aciklama, gorsel, kategoriler) VALUES (51, ' The Punishment', 'Yabancı', '2020', '1:45:34', 'ABD', 5.8, '+13', 'https://www.youtube.com/embed/oUNsToD3jrA', 'When 17 yr old Ariella commits a huge mistake, she embarks on a dark quest where she will discover a secret to her fathers past that will lead them to confront one another.', 'https://images.mubicdn.net/images/film/187187/cache-279641-1560272582/image-w1280.jpg?size=800x', NULL);
INSERT INTO public.film (filmid, ad, tur, vizyon, sure, ulke, puan, yassiniri, filmlinki, aciklama, gorsel, kategoriler) VALUES (52, 'The Reverend', 'Yabancı', '3 Ağustos 2012', '1:28:26', 'Birleşik Krallık', 4.0, '+13', 'https://www.youtube.com/embed/01kB7dbu4qg', 'Başrahibe, Neil Jonesun yönettiği 2011 korku filmi. 7 Ekim 2011de Grimm Up North Film Festivalinde dünya prömiyerini yaptı ve 11 Şubat 2014te Seviye 33e kadar bir DVD yayını aldı. Hikaye, İş Kitabının çok gevşek bir şekilde yeniden anlatılması. Filmin ağırlıklı olarak olumsuz bir kabulü vardı.', 'https://images-na.ssl-images-amazon.com/images/S/pv-target-images/838b3039e203de6b9d25353b4778d4027f73e558115fc935c06d427b5577593b._UY500_UX667_RI_V_TTW_.jpg', NULL);
INSERT INTO public.film (filmid, ad, tur, vizyon, sure, ulke, puan, yassiniri, filmlinki, aciklama, gorsel, kategoriler) VALUES (53, 'Hacker', 'Yabancı', '8 Ocak 2015 ', '1:43:23', 'ABD', 5.4, '+13', 'https://www.youtube.com/embed/F4S27i8x-Pc', 'Hacker yönetmenliğini Michael Mannın yaptığı 2015 yılı yapımı Amerikan gizem - aksiyon filmi. Başrollerini Chris Hemsworth, Tang Wei, Viola Davis üstlenmiştir.', 'https://i0.wp.com/shiftdelete.net/wp-content/uploads/2021/02/en-iyi-10-hacker-filmi.jpg?resize=1170%2C585&ssl=1', NULL);
INSERT INTO public.film (filmid, ad, tur, vizyon, sure, ulke, puan, yassiniri, filmlinki, aciklama, gorsel, kategoriler) VALUES (57, 'Tutsak', 'Yabancı', '27 Aralık 2013 ', '2:18:49', 'Birleşik Krallık', 8.0, '+13', 'https://www.youtube.com/embed/bQRP2g_SFXM', 'Tutsak, 2013 ABD yapımı gerilim filmidir. Yönetmenliğini Denis Villeneuveun yaptığı filmde Hugh Jackman, Jake Gyllenhaal, Viola Davis, Maria Bello, Terrence Howard, Melissa Leo ve Paul Dano yer almaktadır. Film Pensilvanyada kaçırılan iki kız çocuğunun aranması sürecinde yaşanan olayları anlatmaktadır.', 'https://i.ytimg.com/vi/g7ACPAEr_IY/maxresdefault.jpg', NULL);
INSERT INTO public.film (filmid, ad, tur, vizyon, sure, ulke, puan, yassiniri, filmlinki, aciklama, gorsel, kategoriler) VALUES (54, 'The Score', 'Yabancı', '9 Temmuz 2001', '1:58:58', 'ABD', 6.8, '+13', 'https://www.youtube.com/embed/j15eR-8vTl8', 'Skor Frank Ozun yönettiği Robert De Niro, Edward Norton, Angela Bassett, ve Marlon Brando oynadığı 2001 yılının polisiye filmidir. Brando ve De Niro ilk kez birlikte bir filmde birlikte oynamışlardır. Senaryo Daniel E. Taylor ve Emmy ödüllü Kario Salem tarafından kaleme alınmış bir hikâyeye dayanmaktadır. ', 'https://m.media-amazon.com/images/M/MV5BMTY1NDM4MDkyMl5BMl5BanBnXkFtZTcwMDE0ODQ0Nw@@._V1_.jpg', NULL);
INSERT INTO public.film (filmid, ad, tur, vizyon, sure, ulke, puan, yassiniri, filmlinki, aciklama, gorsel, kategoriler) VALUES (43, 'Büyük Dövüş', 'Yabancı', '9 Eylül 2011', '2:10:46', 'ABD', 8.2, '+13', 'https://www.youtube.com/embed/M8UkUf7aVtg', 'Savaşçı, 2011 yapımı ABD dram filmidir. Yönetmenliğini Gavin O Connor ın üstlendiği filmin başrollerinde Tom Hardy, Joel Edgerton, Jennifer Morrison ve Nick Nolte yer alır.', 'https://tr.web.img4.acsta.net/medias/nmedia/18/83/50/33/19711089.jpg', NULL);
INSERT INTO public.film (filmid, ad, tur, vizyon, sure, ulke, puan, yassiniri, filmlinki, aciklama, gorsel, kategoriler) VALUES (46, 'Ejder Kaplanı', 'Yerli', '22 Ocak 2010', '1:42:02', 'Türkiye', 6.5, '+13', 'https://www.youtube.com/embed/brRApgPHUmM', 'Ejder Kapanı, yönetmenliğini Uğur Yücel in yaptığı, başrollerini Uğur Yücel, Kenan İmirzalıoğlu, Nejat İşler, Berrak Tüzünataç ve Ceyda Düvenci nin paylaştığı 2009 yapımı polisiye Türk filmdir.', 'https://i.ytimg.com/vi/4EYisNs5QmE/maxresdefault.jpg', NULL);
INSERT INTO public.film (filmid, ad, tur, vizyon, sure, ulke, puan, yassiniri, filmlinki, aciklama, gorsel, kategoriler) VALUES (49, 'Battle of Defense 2', 'Yabancı', '2 Nisan 2022 ', '1:45:34', 'Birleşik Krallık', 5.5, '+13', 'https://www.youtube.com/embed/_8ymTja8Izw', 'This story is adapted from real events about a defending team of an African bodyguard company who encountered armed bandits slaughtering civilians.', 'https://jharkhandupdates.com/wp-content/uploads/2020/09/stafy1.jpg', NULL);
INSERT INTO public.film (filmid, ad, tur, vizyon, sure, ulke, puan, yassiniri, filmlinki, aciklama, gorsel, kategoriler) VALUES (44, 'Becky', 'Yabancı', '5 Haziran 2020', '1:22:38', 'ABD', 5.9, '+13', 'https://www.youtube.com/embed/a3W67bwsw60', 'Becky, Jonathan Milott ve Cary Murnion tarafından yönetilen, senaryosu Nick Morris, Lane Skye ve Ruckus Skye tarafından yazılan 2020 Amerikan aksiyon gerilim filmidir. Filmde Lulu Wilson, Kevin James ve Joel McHale rol alıyor.', 'https://lh3.googleusercontent.com/yzDEXxVkrEbblLup8xiqMEW0yfh9tddeMCHaBktDV_TWeuTcVmmskPeyeZYb8G3u91ip-1LIOWJy8A', NULL);
INSERT INTO public.film (filmid, ad, tur, vizyon, sure, ulke, puan, yassiniri, filmlinki, aciklama, gorsel, kategoriler) VALUES (58, 'Predestination', 'Yabancı', ' 28 Ağustos 2014', ' 1:29:46', 'Avusturalya', 8.0, '+13', 'https://www.youtube.com/embed/sIE5Jmcssx0', 'Predestination, 2014 Avustralya yapımı bilimkurgu filmidir. Film Michael ve Peter Spierig kardeşler tarafından yazılıp, yönetilmiştir. Robert A. Heinleinın kısa hikâyesi All You Zombiesten uyarlanmıştır. Filmin başrollerinde Ethan Hawke, Sarah Snook ve Noah Taylor var.', 'https://i.ytimg.com/vi/sIE5Jmcssx0/maxresdefault.jpg', NULL);
INSERT INTO public.film (filmid, ad, tur, vizyon, sure, ulke, puan, yassiniri, filmlinki, aciklama, gorsel, kategoriler) VALUES (59, 'Yasadışı', 'Yabancı', '21 Ağu 2018', '1:32:08', 'ABD', 4.7, '+13', 'https://www.youtube.com/embed/E9d9wv-yueo', 'A Royal Marines Commando uncovers evidence that could bring down a corrupt official and put him behind bars for life.', 'https://theactionelite.com/wp-content/uploads/2018/10/Capture-7.png', NULL);
INSERT INTO public.film (filmid, ad, tur, vizyon, sure, ulke, puan, yassiniri, filmlinki, aciklama, gorsel, kategoriler) VALUES (60, 'Cadılar Zamanı', 'Yabancı', ' 14 Ocak 2011', ' 1:21:49', 'Birleşik Krallık', 7.4, '+13', 'https://www.youtube.com/embed/xrZCOcf-Y0w', 'Cadı Sezonu, Nicolas Cage ve Ron Perlmanın başrol oynadığı ve Dominic Sena tarafından yönetilen 2011 Amerikan doğaüstü aksiyon-macera filmidir. Cage ve Perlman, Haçlı Seferlerinden dönen ve vatanlarını Kara Ölüm tarafından mahvolmuş bulan Cermen Şövalyeleri olarak rol alıyorlar. ', 'https://i.ytimg.com/vi/xrZCOcf-Y0w/maxresdefault.jpg', NULL);
INSERT INTO public.film (filmid, ad, tur, vizyon, sure, ulke, puan, yassiniri, filmlinki, aciklama, gorsel, kategoriler) VALUES (61, 'Narcos', 'Yabancı', ' 28 Ağustos 2015', '1:07:48', 'ABD', 8.7, '+13', 'https://www.youtube.com/embed/D_SOuodPuKI', 'Narcos, Amerikan suç draması ve aksiyon filmi.', 'https://imgrosetta.mynet.com.tr/file/12242953/728xauto.jpg', NULL);
INSERT INTO public.film (filmid, ad, tur, vizyon, sure, ulke, puan, yassiniri, filmlinki, aciklama, gorsel, kategoriler) VALUES (62, 'Transcendence', 'Yabancı', '10 Ekim 2014 ', '1:47:28', 'Birleşik Krallık', 6.2, '+13', 'https://www.youtube.com/embed/yAK_zRGxu-o', 'Evrim, Wally Pfisterin ilk yönetmenlik denemesi olan ve senaryosu Jack Paglen tarafından yazılan, 2014 yapımı bilimkurgu aksiyon gerilim türündeki film. Filmin başrollerinde Johnny Depp, Rebecca Hall ve Morgan Freeman oynamaktadır. ', 'https://www.bilimkurgukulubu.com/wp-content/uploads/2018/06/Transcendence.jpg', NULL);
INSERT INTO public.film (filmid, ad, tur, vizyon, sure, ulke, puan, yassiniri, filmlinki, aciklama, gorsel, kategoriler) VALUES (63, 'Öldür Komutu', 'Yabancı', '13 Mayıs 2016', '1:31:08', 'Birleşik Krallık', 7.0, '+13', 'https://www.youtube.com/embed/wkVDU9UZd9s', 'Kill Command, Steven Gomez tarafından yazılan ve yönetilen ve Thure Lindhardt ve Vanessa Kirbynin oynadığı 2016 İngiliz bilim kurgu aksiyon korku filmi. Hikaye, A.I. savaşına karşı bir eğitim görevinden sonra hayatta kalmaya çalışan bir grup ABD Denizcisine odaklanıyor. ters gidiyor.', 'https://i.ytimg.com/vi/wkVDU9UZd9s/maxresdefault.jpg', NULL);
INSERT INTO public.film (filmid, ad, tur, vizyon, sure, ulke, puan, yassiniri, filmlinki, aciklama, gorsel, kategoriler) VALUES (64, 'Koğuş ', 'Yabancı', '3 Haziran 2011', '1:10:27', 'Avusturalya', 7.0, '+13', 'https://www.youtube.com/embed/vaKGQGnM9lc', 'Akil hastanesine kapatilan Kristen bir süre sonra hastanede yasayan vahsi ve çirkin bir hayalet tarafindan taciz edilmeye baslar. Hastanedeki kizlardan bazilari bu hayalet tarafindan öldürülünce Kristen kaçis planlari yapar.', 'https://hipokratist.com/wp-content/uploads/2018/04/Ko%C4%9Fu%C5%9F-The-Ward.png', NULL);
INSERT INTO public.film (filmid, ad, tur, vizyon, sure, ulke, puan, yassiniri, filmlinki, aciklama, gorsel, kategoriler) VALUES (65, 'Genç Ölürüz', 'Yabancı', ' 7 Şubat 2019', ' 1:27:37', 'ABD', 7.0, '+13', 'https://www.youtube.com/embed/m_Bl3K4Uneg', 'Acımasız uyuşturucu baronu Rinconun getir götür işi için yanına aldığı 10 yaşındaki Miguel ve kendi izlediği kötü yola girmesine engel olmak için elinden geleni yapmaya çalışan 14 yaşındaki abisi Lucas uyuşturucu baronundan kaçmaya başlamıştır. Çocukların yolu Afganistan gazisi Daniel ile kesişir. Daniel çocukları koruyacak ve uyuşturucu baronundan intikam almalarına yardım edecektir.

', 'https://www.themoviedb.org/t/p/original/mYU1NFj8U99yX4sXEGcvEGQ7RQG.jpg', NULL);
INSERT INTO public.film (filmid, ad, tur, vizyon, sure, ulke, puan, yassiniri, filmlinki, aciklama, gorsel, kategoriler) VALUES (45, 'Bizans Oyunları', 'Yerli', '15 Ocak 2016', '1:41:19', 'Türkiye', 3.7, '+13', 'https://www.youtube.com/embed/zcJMU7um-uk', 'Güney Amerika nin sicaklarindan bikan Mayalar Anadolu ya göç ederler. Burada komsulari olan Bizans in dikkatini çekerler ve Kraliçe Klitorya Mayalar in yükselisini durdurmak ister. Planina göre bütün Maya kadinlari zindanlara atip onlarin genlerini Bizans genleriyle bozacaktir.', 'https://i.cnnturk.com/i/cnnturk/75/740x416/627cf3be2af10718e04b9859.jpg', NULL);


--
-- TOC entry 3444 (class 0 OID 49672)
-- Dependencies: 235
-- Data for Name: filmkategori; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.filmkategori (id, film_id, kategori_id) VALUES (13, 47, 1);
INSERT INTO public.filmkategori (id, film_id, kategori_id) VALUES (14, 47, 6);
INSERT INTO public.filmkategori (id, film_id, kategori_id) VALUES (15, 48, 1);
INSERT INTO public.filmkategori (id, film_id, kategori_id) VALUES (19, 50, 2);
INSERT INTO public.filmkategori (id, film_id, kategori_id) VALUES (20, 51, 1);
INSERT INTO public.filmkategori (id, film_id, kategori_id) VALUES (21, 51, 8);
INSERT INTO public.filmkategori (id, film_id, kategori_id) VALUES (22, 52, 5);
INSERT INTO public.filmkategori (id, film_id, kategori_id) VALUES (23, 53, 4);
INSERT INTO public.filmkategori (id, film_id, kategori_id) VALUES (26, 55, 6);
INSERT INTO public.filmkategori (id, film_id, kategori_id) VALUES (27, 55, 8);
INSERT INTO public.filmkategori (id, film_id, kategori_id) VALUES (28, 56, 6);
INSERT INTO public.filmkategori (id, film_id, kategori_id) VALUES (29, 57, 1);
INSERT INTO public.filmkategori (id, film_id, kategori_id) VALUES (30, 57, 8);
INSERT INTO public.filmkategori (id, film_id, kategori_id) VALUES (31, 54, 1);
INSERT INTO public.filmkategori (id, film_id, kategori_id) VALUES (32, 54, 8);
INSERT INTO public.filmkategori (id, film_id, kategori_id) VALUES (34, 58, 4);
INSERT INTO public.filmkategori (id, film_id, kategori_id) VALUES (35, 59, 1);
INSERT INTO public.filmkategori (id, film_id, kategori_id) VALUES (36, 60, 1);
INSERT INTO public.filmkategori (id, film_id, kategori_id) VALUES (37, 60, 6);
INSERT INTO public.filmkategori (id, film_id, kategori_id) VALUES (43, 44, 1);
INSERT INTO public.filmkategori (id, film_id, kategori_id) VALUES (45, 61, 18);
INSERT INTO public.filmkategori (id, film_id, kategori_id) VALUES (46, 62, 4);
INSERT INTO public.filmkategori (id, film_id, kategori_id) VALUES (47, 63, 1);
INSERT INTO public.filmkategori (id, film_id, kategori_id) VALUES (48, 63, 4);
INSERT INTO public.filmkategori (id, film_id, kategori_id) VALUES (53, 64, 5);
INSERT INTO public.filmkategori (id, film_id, kategori_id) VALUES (54, 64, 8);
INSERT INTO public.filmkategori (id, film_id, kategori_id) VALUES (55, 65, 1);
INSERT INTO public.filmkategori (id, film_id, kategori_id) VALUES (56, 41, 1);
INSERT INTO public.filmkategori (id, film_id, kategori_id) VALUES (57, 42, 1);
INSERT INTO public.filmkategori (id, film_id, kategori_id) VALUES (58, 42, 6);
INSERT INTO public.filmkategori (id, film_id, kategori_id) VALUES (59, 43, 1);
INSERT INTO public.filmkategori (id, film_id, kategori_id) VALUES (60, 43, 3);
INSERT INTO public.filmkategori (id, film_id, kategori_id) VALUES (61, 45, 2);
INSERT INTO public.filmkategori (id, film_id, kategori_id) VALUES (62, 49, 1);
INSERT INTO public.filmkategori (id, film_id, kategori_id) VALUES (63, 49, 8);


--
-- TOC entry 3426 (class 0 OID 49497)
-- Dependencies: 217
-- Data for Name: fotograflar; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.fotograflar (id, filmid, linki) VALUES (160, 41, 'indir.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (161, 41, 'indir (5).jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (162, 41, 'indir (4).jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (163, 42, 'mx.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (164, 42, 'mx2.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (165, 42, 'mx3.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (166, 43, 'warrior.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (167, 43, 'warrior2.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (168, 43, 'warrior4.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (169, 44, 'becky5.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (170, 44, 'becky2.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (171, 44, 'becky4.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (172, 45, 'bizans1.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (173, 45, 'bizans2.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (174, 45, 'bizans5.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (175, 46, 'ej1.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (176, 46, 'ej2.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (177, 46, 'ej3.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (178, 47, 'uncharted.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (179, 47, 'uncharted2.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (180, 47, 'uncharted3.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (181, 48, 'börü4.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (182, 48, 'börü15.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (183, 48, 'börü2.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (184, 49, 'battle1.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (185, 49, 'battle2.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (186, 49, 'battle13.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (187, 50, 'keriz1.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (188, 50, 'keriz2.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (189, 50, 'keriz3.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (190, 51, 'punish1.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (191, 51, 'punish2.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (192, 51, 'punish3.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (193, 52, 'revened1.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (194, 52, 'revened2.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (195, 52, 'revened3.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (196, 53, 'hc.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (197, 53, 'hc1.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (198, 53, 'hc2.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (199, 54, 'score.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (200, 54, 'score2.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (201, 54, 'score3.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (202, 55, 'dağ1.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (203, 55, 'dağ2.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (204, 55, 'dağ3.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (205, 56, 'kü.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (206, 56, 'kü1.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (207, 56, 'kü2.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (208, 57, 'tutsak.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (209, 57, 'tutsak2.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (210, 57, 'tutsak3.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (211, 58, 'pre1.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (212, 58, 'pre2.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (213, 58, 'pre3.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (214, 59, 'yasıdışı.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (215, 51, 'yasadışı2.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (216, 59, 'yasadışı3.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (217, 60, 'cd1.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (218, 60, 'cd2.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (219, 60, 'cd3.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (220, 61, 'narcos1.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (221, 61, 'narcos2.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (222, 61, 'narcos3.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (223, 62, 'trans.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (224, 62, 'trans3.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (225, 62, 'trans2.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (226, 63, 'öldür.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (227, 63, 'öldür2.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (228, 63, 'öldür3.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (229, 64, 'koğuş1.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (230, 64, 'koğuş2.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (231, 64, 'koğuş3.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (232, 65, 'gç.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (233, 65, 'gç1.jfif');
INSERT INTO public.fotograflar (id, filmid, linki) VALUES (234, 65, 'gç2.jfif');


--
-- TOC entry 3423 (class 0 OID 49487)
-- Dependencies: 214
-- Data for Name: iletisim; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 3430 (class 0 OID 49522)
-- Dependencies: 221
-- Data for Name: kategori; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.kategori (id, adi) VALUES (1, 'Aksiyon');
INSERT INTO public.kategori (id, adi) VALUES (2, 'Komedi');
INSERT INTO public.kategori (id, adi) VALUES (3, 'Dram');
INSERT INTO public.kategori (id, adi) VALUES (4, 'Bilim Kurgu');
INSERT INTO public.kategori (id, adi) VALUES (5, 'Korku');
INSERT INTO public.kategori (id, adi) VALUES (6, 'Macera');
INSERT INTO public.kategori (id, adi) VALUES (7, 'Savaş');
INSERT INTO public.kategori (id, adi) VALUES (9, 'Biyografi');
INSERT INTO public.kategori (id, adi) VALUES (10, 'Romantik');
INSERT INTO public.kategori (id, adi) VALUES (11, 'Spor');
INSERT INTO public.kategori (id, adi) VALUES (13, 'Fantastik');
INSERT INTO public.kategori (id, adi) VALUES (14, 'Polisiye');
INSERT INTO public.kategori (id, adi) VALUES (15, 'Tarih');
INSERT INTO public.kategori (id, adi) VALUES (12, 'Müzik');
INSERT INTO public.kategori (id, adi) VALUES (8, 'Gerilim');
INSERT INTO public.kategori (id, adi) VALUES (18, 'Suç');


--
-- TOC entry 3440 (class 0 OID 49608)
-- Dependencies: 231
-- Data for Name: kullanicilar; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.kullanicilar (id, kullaniciadi, ad, soyad, eposta, sifre, ugroup) VALUES (8, 'Ahmo', 'Ahmed İhsan', 'Karataş', 'a.ihsankaratas@hotmail.com', '123456', 2);
INSERT INTO public.kullanicilar (id, kullaniciadi, ad, soyad, eposta, sifre, ugroup) VALUES (7, 'Eros', 'Eren Can', 'Ar', 'arerencan@hotmail.com', '123456', 1);
INSERT INTO public.kullanicilar (id, kullaniciadi, ad, soyad, eposta, sifre, ugroup) VALUES (9, 'Celo', 'Celal', 'Binici', 'c.binici@hotmail.com', '123456', 1);
INSERT INTO public.kullanicilar (id, kullaniciadi, ad, soyad, eposta, sifre, ugroup) VALUES (10, 'binici@hotmail.com', 'binici@hotmail.com', 'binici@hotmail.com', 'binici@hotmail.com', '123456', 3);


--
-- TOC entry 3428 (class 0 OID 49512)
-- Dependencies: 219
-- Data for Name: loglar; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 3442 (class 0 OID 49626)
-- Dependencies: 233
-- Data for Name: privilege; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.privilege (id, sgroup, mname, icreate, iupdate, idelete, ilist, ishow, iread) VALUES (1, 1, 'Kategori', true, true, true, true, true, true);
INSERT INTO public.privilege (id, sgroup, mname, icreate, iupdate, idelete, ilist, ishow, iread) VALUES (2, 1, 'Fotograflar', true, true, true, false, false, false);
INSERT INTO public.privilege (id, sgroup, mname, icreate, iupdate, idelete, ilist, ishow, iread) VALUES (3, 1, 'Filmler', true, true, true, false, false, false);
INSERT INTO public.privilege (id, sgroup, mname, icreate, iupdate, idelete, ilist, ishow, iread) VALUES (4, 1, 'Sss', true, true, true, false, false, false);
INSERT INTO public.privilege (id, sgroup, mname, icreate, iupdate, idelete, ilist, ishow, iread) VALUES (5, 1, 'Iletisim', true, true, true, false, false, false);
INSERT INTO public.privilege (id, sgroup, mname, icreate, iupdate, idelete, ilist, ishow, iread) VALUES (6, 1, 'Kullanicilar', true, true, true, false, false, false);
INSERT INTO public.privilege (id, sgroup, mname, icreate, iupdate, idelete, ilist, ishow, iread) VALUES (7, 1, 'Loglar', true, true, true, false, false, false);
INSERT INTO public.privilege (id, sgroup, mname, icreate, iupdate, idelete, ilist, ishow, iread) VALUES (8, 1, 'Yorumlar', true, true, true, false, false, false);
INSERT INTO public.privilege (id, sgroup, mname, icreate, iupdate, idelete, ilist, ishow, iread) VALUES (9, 2, 'Filmler', false, true, false, false, false, false);


--
-- TOC entry 3421 (class 0 OID 49469)
-- Dependencies: 212
-- Data for Name: sss; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.sss (soruid, soru, cevap) VALUES (1, 'Hiç bir video açılmıyor, nedeni nedir ?', 'Internet Download Manager ( IDM ) gibi bazı video indirme programları yüzünden videolar açılmıyor olabilir. Lütfen bu veya buna benzer programları kapatıp deneyiniz.  Ayrıca diğer bir sebep de kullanmış olduğunuz DNS olabilir. Lütfen DNS değiştirin yada otomatik yapıp tekrar deneyin.');
INSERT INTO public.sss (soruid, soru, cevap) VALUES (2, 'Çalışmayan yada silinmiş videolar ?', 'Biz site yöneticileri olarak şuan tüm videolar çalışıyor varsayıyoruz. Binlerce filmi her gün kontrol etme gibi bir lüksümüz olamaz. Ancak çalışmayan yahut silinmiş olan videoyu bize bildirmeniz 3 saniyenizi almaz. Hemen sağ üstteki Sorun Bildir yada alttan yorum yaparak bize bildirebilirsiniz. Hiç bir yorum ve bildiriminiz göz ardı edilmez.');
INSERT INTO public.sss (soruid, soru, cevap) VALUES (3, 'Filmlerde Takılma Donma yada Yarıda Kesilme durumları', 'Arkadaşlar bu gibi durumların en baş sebebi, eski bir bilgisayar yada yavaş internet ile HD izlemeye çalışmanızdır. 720p yada 1080p ile izlemek yerine kaliteyi 480p yahut 360p ye düşürüp deneyiniz. Yinede bize yorum ile ulaşarak kontrol etmemizi önerirseniz kesinlikle her video ve yorum kontrol edilecektir.');
INSERT INTO public.sss (soruid, soru, cevap) VALUES (4, 'Videoları nasıl indirebilirim ?', 'Sitemizin amacı film indirtmek değildir, Onlline film izletmektir. Yinede indirmek istiyorsanız google amcaya sorabilirsiniz. Video nasıl indiririm hangi programla indiririm şeklinde.');
INSERT INTO public.sss (soruid, soru, cevap) VALUES (5, 'Size Nasıl Yardım Edebilirim ?', 'Sitemize her gün minimum 1 kere girerek  İzlediğiniz videoya yorum yaparak  İzlediğiniz videoyu facebook twitter yada google plus da paylaşarak  bizlere büyük oranda yardım etmiş olursunuz, elleriniz dert görmesin şimdiden..');
INSERT INTO public.sss (soruid, soru, cevap) VALUES (6, 'Video Player gözükmüyor yada siyah ekran çıkıyor yada hiç bişey yok, bunun sebebi nedir ?', 'Bazen videoların yüklendiği sitelerde problemler olabiliyor ancak bu uzun süreli bir problem değildir. 5 dk sonra tekrar deneyiniz. Eğer sorun bu değil ise lütfen sayfayı bir kaç kez daha yenileyin, muhtemel olarak sorun kalmayacaktır.');


--
-- TOC entry 3438 (class 0 OID 49597)
-- Dependencies: 229
-- Data for Name: systemgroup; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.systemgroup (id, gname, created, updated) VALUES (1, 'Admin', '2022-05-31 16:38:13.516144', '2022-05-31 16:38:13.516144');
INSERT INTO public.systemgroup (id, gname, created, updated) VALUES (2, 'Moderatör', '2022-05-31 16:38:13.516144', '2022-05-31 16:38:13.516144');
INSERT INTO public.systemgroup (id, gname, created, updated) VALUES (3, 'Viwer', '2022-05-31 16:38:13.516144', '2022-05-31 16:38:13.516144');


--
-- TOC entry 3434 (class 0 OID 49564)
-- Dependencies: 225
-- Data for Name: yorumlar; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.yorumlar (yorumid, kullaniciid, filmid, yorum, tarih) VALUES (11, 9, 41, 'asd', '2022-06-01');
INSERT INTO public.yorumlar (yorumid, kullaniciid, filmid, yorum, tarih) VALUES (12, 9, 42, 'çok güzel.', '2022-06-01');
INSERT INTO public.yorumlar (yorumid, kullaniciid, filmid, yorum, tarih) VALUES (13, 9, 45, 'Beğenmedim.', '2022-06-01');


--
-- TOC entry 3466 (class 0 OID 0)
-- Dependencies: 226
-- Name: document_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.document_id_seq', 99, true);


--
-- TOC entry 3467 (class 0 OID 0)
-- Dependencies: 209
-- Name: film_filmid_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.film_filmid_seq', 65, true);


--
-- TOC entry 3468 (class 0 OID 0)
-- Dependencies: 234
-- Name: filmkategori_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.filmkategori_id_seq', 63, true);


--
-- TOC entry 3469 (class 0 OID 0)
-- Dependencies: 216
-- Name: fotograflar_filmid_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.fotograflar_filmid_seq', 1, true);


--
-- TOC entry 3470 (class 0 OID 0)
-- Dependencies: 215
-- Name: fotograflar_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.fotograflar_id_seq', 234, true);


--
-- TOC entry 3471 (class 0 OID 0)
-- Dependencies: 213
-- Name: iletisim_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.iletisim_id_seq', 1, false);


--
-- TOC entry 3472 (class 0 OID 0)
-- Dependencies: 220
-- Name: kategori_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.kategori_id_seq', 18, true);


--
-- TOC entry 3473 (class 0 OID 0)
-- Dependencies: 230
-- Name: kullanicilar_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.kullanicilar_id_seq', 10, true);


--
-- TOC entry 3474 (class 0 OID 0)
-- Dependencies: 218
-- Name: loglar_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.loglar_id_seq', 1, false);


--
-- TOC entry 3475 (class 0 OID 0)
-- Dependencies: 232
-- Name: privilege_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.privilege_id_seq', 9, true);


--
-- TOC entry 3476 (class 0 OID 0)
-- Dependencies: 211
-- Name: sss_soruid_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.sss_soruid_seq', 6, true);


--
-- TOC entry 3477 (class 0 OID 0)
-- Dependencies: 228
-- Name: systemgroup_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.systemgroup_id_seq', 9, true);


--
-- TOC entry 3478 (class 0 OID 0)
-- Dependencies: 224
-- Name: yorumlar_filmid_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.yorumlar_filmid_seq', 1, false);


--
-- TOC entry 3479 (class 0 OID 0)
-- Dependencies: 223
-- Name: yorumlar_kullaniciid_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.yorumlar_kullaniciid_seq', 1, false);


--
-- TOC entry 3480 (class 0 OID 0)
-- Dependencies: 222
-- Name: yorumlar_yorumid_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.yorumlar_yorumid_seq', 13, true);


--
-- TOC entry 3262 (class 2606 OID 49593)
-- Name: document document_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.document
    ADD CONSTRAINT document_pkey PRIMARY KEY (id);


--
-- TOC entry 3248 (class 2606 OID 49281)
-- Name: film film_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.film
    ADD CONSTRAINT film_pkey PRIMARY KEY (filmid);


--
-- TOC entry 3272 (class 2606 OID 49677)
-- Name: filmkategori filmkategori_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.filmkategori
    ADD CONSTRAINT filmkategori_pkey PRIMARY KEY (id);


--
-- TOC entry 3254 (class 2606 OID 49505)
-- Name: fotograflar fotograflar_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.fotograflar
    ADD CONSTRAINT fotograflar_pkey PRIMARY KEY (id);


--
-- TOC entry 3252 (class 2606 OID 49494)
-- Name: iletisim iletisim_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.iletisim
    ADD CONSTRAINT iletisim_pkey PRIMARY KEY (id);


--
-- TOC entry 3258 (class 2606 OID 49529)
-- Name: kategori kategori_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.kategori
    ADD CONSTRAINT kategori_pkey PRIMARY KEY (id);


--
-- TOC entry 3268 (class 2606 OID 49615)
-- Name: kullanicilar kullanicilar_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.kullanicilar
    ADD CONSTRAINT kullanicilar_pkey PRIMARY KEY (id);


--
-- TOC entry 3256 (class 2606 OID 49520)
-- Name: loglar loglar_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.loglar
    ADD CONSTRAINT loglar_pkey PRIMARY KEY (id);


--
-- TOC entry 3270 (class 2606 OID 49637)
-- Name: privilege privilege_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.privilege
    ADD CONSTRAINT privilege_pkey PRIMARY KEY (id);


--
-- TOC entry 3250 (class 2606 OID 49476)
-- Name: sss sss_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.sss
    ADD CONSTRAINT sss_pkey PRIMARY KEY (soruid);


--
-- TOC entry 3264 (class 2606 OID 49606)
-- Name: systemgroup systemgroup_gname_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.systemgroup
    ADD CONSTRAINT systemgroup_gname_key UNIQUE (gname);


--
-- TOC entry 3266 (class 2606 OID 49604)
-- Name: systemgroup systemgroup_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.systemgroup
    ADD CONSTRAINT systemgroup_pkey PRIMARY KEY (id);


--
-- TOC entry 3260 (class 2606 OID 49574)
-- Name: yorumlar yorumlar_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.yorumlar
    ADD CONSTRAINT yorumlar_pkey PRIMARY KEY (yorumid);


--
-- TOC entry 3277 (class 2606 OID 49678)
-- Name: filmkategori filmkategori_film_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.filmkategori
    ADD CONSTRAINT filmkategori_film_id_fkey FOREIGN KEY (film_id) REFERENCES public.film(filmid);


--
-- TOC entry 3278 (class 2606 OID 49683)
-- Name: filmkategori filmkategori_kategori_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.filmkategori
    ADD CONSTRAINT filmkategori_kategori_id_fkey FOREIGN KEY (kategori_id) REFERENCES public.kategori(id);


--
-- TOC entry 3273 (class 2606 OID 49506)
-- Name: fotograflar fotograflar_filmid_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.fotograflar
    ADD CONSTRAINT fotograflar_filmid_fkey FOREIGN KEY (filmid) REFERENCES public.film(filmid) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- TOC entry 3275 (class 2606 OID 49616)
-- Name: kullanicilar kullanicilar_ugroup_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.kullanicilar
    ADD CONSTRAINT kullanicilar_ugroup_fkey FOREIGN KEY (ugroup) REFERENCES public.systemgroup(id);


--
-- TOC entry 3276 (class 2606 OID 49638)
-- Name: privilege privilege_sgroup_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.privilege
    ADD CONSTRAINT privilege_sgroup_fkey FOREIGN KEY (sgroup) REFERENCES public.systemgroup(id);


--
-- TOC entry 3274 (class 2606 OID 49580)
-- Name: yorumlar yorumlar_filmid_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.yorumlar
    ADD CONSTRAINT yorumlar_filmid_fkey FOREIGN KEY (filmid) REFERENCES public.film(filmid) ON UPDATE CASCADE ON DELETE CASCADE;


-- Completed on 2022-06-02 00:46:06

--
-- PostgreSQL database dump complete
--

