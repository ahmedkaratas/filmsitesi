--
-- PostgreSQL database dump
--

-- Dumped from database version 14.2
-- Dumped by pg_dump version 14.2

-- Started on 2022-06-02 01:22:44

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
-- TOC entry 3423 (class 0 OID 0)
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
-- TOC entry 3424 (class 0 OID 0)
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
-- TOC entry 3425 (class 0 OID 0)
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
-- TOC entry 3426 (class 0 OID 0)
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
-- TOC entry 3427 (class 0 OID 0)
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
-- TOC entry 3428 (class 0 OID 0)
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
-- TOC entry 3429 (class 0 OID 0)
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
-- TOC entry 3430 (class 0 OID 0)
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
-- TOC entry 3431 (class 0 OID 0)
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
-- TOC entry 3432 (class 0 OID 0)
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
-- TOC entry 3433 (class 0 OID 0)
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
-- TOC entry 3434 (class 0 OID 0)
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
-- TOC entry 3435 (class 0 OID 0)
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
-- TOC entry 3436 (class 0 OID 0)
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
-- TOC entry 3437 (class 0 OID 0)
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


-- Completed on 2022-06-02 01:22:45

--
-- PostgreSQL database dump complete
--

