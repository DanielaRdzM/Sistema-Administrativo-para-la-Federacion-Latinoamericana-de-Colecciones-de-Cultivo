--
-- PostgreSQL database dump
--

-- Dumped from database version 15.0
-- Dumped by pg_dump version 15.0

-- Started on 2023-01-16 17:47:24

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

--
-- TOC entry 6 (class 2615 OID 16413)
-- Name: webapp; Type: SCHEMA; Schema: -; Owner: administradorFelacc
--

CREATE SCHEMA webapp;


ALTER SCHEMA webapp OWNER TO "administradorFelacc";

--
-- TOC entry 218 (class 1259 OID 16453)
-- Name: colecciones_id_seq; Type: SEQUENCE; Schema: webapp; Owner: postgres
--

CREATE SEQUENCE webapp.colecciones_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE webapp.colecciones_id_seq OWNER TO postgres;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 219 (class 1259 OID 16454)
-- Name: colecciones; Type: TABLE; Schema: webapp; Owner: postgres
--

CREATE TABLE webapp.colecciones (
    id integer DEFAULT nextval('webapp.colecciones_id_seq'::regclass) NOT NULL,
    pais character varying(600) NOT NULL,
    coleccion character varying(600) NOT NULL,
    acronimo character varying(600) NOT NULL,
    instituto character varying(600) NOT NULL,
    direccion character varying(600),
    telefono character varying(600),
    curador character varying(600),
    email character varying(600),
    tipo_de_microorganismo character varying(600),
    tipo_de_coleccion character varying(600)
);


ALTER TABLE webapp.colecciones OWNER TO postgres;

--
-- TOC entry 217 (class 1259 OID 16446)
-- Name: socios; Type: TABLE; Schema: webapp; Owner: postgres
--

CREATE TABLE webapp.socios (
    id integer NOT NULL,
    nombre character varying(600) NOT NULL,
    especialidad character varying(600) NOT NULL,
    pais character varying(600) NOT NULL,
    instituto character varying(600) NOT NULL,
    email character varying(600) NOT NULL,
    telefono character varying(600) NOT NULL,
    linkedin character varying(600),
    foto character varying(600)
);


ALTER TABLE webapp.socios OWNER TO postgres;

--
-- TOC entry 216 (class 1259 OID 16437)
-- Name: socios_id; Type: SEQUENCE; Schema: webapp; Owner: postgres
--

CREATE SEQUENCE webapp.socios_id
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE webapp.socios_id OWNER TO postgres;

--
-- TOC entry 215 (class 1259 OID 16414)
-- Name: socios_id_seq; Type: SEQUENCE; Schema: webapp; Owner: postgres
--

CREATE SEQUENCE webapp.socios_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE webapp.socios_id_seq OWNER TO postgres;

--
-- TOC entry 220 (class 1259 OID 16462)
-- Name: usuarios; Type: TABLE; Schema: webapp; Owner: postgres
--

CREATE TABLE webapp.usuarios (
    email character varying(600) NOT NULL,
    password character varying(600) NOT NULL
);


ALTER TABLE webapp.usuarios OWNER TO postgres;

--
-- TOC entry 3335 (class 0 OID 16454)
-- Dependencies: 219
-- Data for Name: colecciones; Type: TABLE DATA; Schema: webapp; Owner: postgres
--

COPY webapp.colecciones (id, pais, coleccion, acronimo, instituto, direccion, telefono, curador, email, tipo_de_microorganismo, tipo_de_coleccion) FROM stdin;
1	Argentina	Colección del Área de Agroalimentos de la Universidad Nacional de Buenos Aires	AGRAL	Universidad Nacional de Buenos Aires. Facultad de Agronomía. Área Agroalimentos	Av. San Martín 4453 - C1417DSE - Buenos Aires - Argentina	541144524800	541144524800	miyazaki@mail.agro.uba.ar	Microorganismos de agua y alimentos Polímeros biodegradables	Investigación
2	Brasil	Coleção de Microganismos de Referência em Vigilância Sanitária	CMRVS (EX INCQS)	FIOCRUZ. Instituto Nacional de Controle de Qualidade em Saude-INCQS	FIIOCRUZ/INCQS Av. Brasil, 4365-Manguinhos. Rio de Janeiro-RJ-21045-900. Brasil	552138655236	Ivano de Filippis	colecao@incqs.fiocruz.br	Archaea, Bacterias, Fungos	Coleção de Referência
3	Colombia	Colección de Microorganismos Pontificia Universidad Javeriana	CMPUJ	Pontificia Universidad Javeriana	Carrera 7 Nº 43-82. 571 3208320 Ex:t 4155 - 4107	415541074047	Marcela Rey Arévalo	alba.trespalacios@javeriana.edu.co	Bacterias, Hongos	Biomédico, Biotecnologia, Veterinario y Ambiental
4	Cuba	Cepario del Archivo Nacional de Cuba	CARNAC	Ministerio de Ciencia, Tecnologia y Medio Ambiente (CITMA)	Compostela 906 esq. San Isidro, Codigo Postal: 10100, Habana Vieja, La Habana, Cuba	5728629436	Sofia Borrego	sofia@arnac.cu	Bacterias, Hongos, Levaduras	Investigación
\.


--
-- TOC entry 3333 (class 0 OID 16446)
-- Dependencies: 217
-- Data for Name: socios; Type: TABLE DATA; Schema: webapp; Owner: postgres
--

COPY webapp.socios (id, nombre, especialidad, pais, instituto, email, telefono, linkedin, foto) FROM stdin;
64	Sergio Zepeda	Computación	México	UAM-C	sergioz@dccd.mx	5567357312	https://mx.linkedin.com/in/sergio-zepeda-a3a253121	64.jpg
71	Romina Andrea Joris	Microbiología	Argentina	Cepario de la Facultad de Bioquímica y Cs Biológicas	rjoris@fbcb.unl.edu.ar	9590153853	https://ar.linkedin.com/in/romina-joris-47a471145	71.jpg
95	Vania Aparecoda Vicente	Colecciones Microbiológicas da Rede Paranaense-Taxonline (CMRP-Taxonline)	Brasil	Universidad Federal del Estado de Paraná	vaniava63@gmail.com	9812803467	https://br.linkedin.com/in/vania-vicente-b2410513b	95.jpg
66	Cledir Rodigues Santos	Banco de Recursos Microbiológicos BRmB/UFRO	Chile	Facultad de Ingeniería y Ciencias, Universidad de La Frontera	brmb-ufro@ufrontera.cl	5695108417	https://cl.linkedin.com/in/cledir-santos-602141208	66.jpg
\.


--
-- TOC entry 3336 (class 0 OID 16462)
-- Dependencies: 220
-- Data for Name: usuarios; Type: TABLE DATA; Schema: webapp; Owner: postgres
--

COPY webapp.usuarios (email, password) FROM stdin;
administradorfelacc@gmail.com	administradorfelacc
\.


--
-- TOC entry 3342 (class 0 OID 0)
-- Dependencies: 218
-- Name: colecciones_id_seq; Type: SEQUENCE SET; Schema: webapp; Owner: postgres
--

SELECT pg_catalog.setval('webapp.colecciones_id_seq', 1, false);


--
-- TOC entry 3343 (class 0 OID 0)
-- Dependencies: 216
-- Name: socios_id; Type: SEQUENCE SET; Schema: webapp; Owner: postgres
--

SELECT pg_catalog.setval('webapp.socios_id', 1, false);


--
-- TOC entry 3344 (class 0 OID 0)
-- Dependencies: 215
-- Name: socios_id_seq; Type: SEQUENCE SET; Schema: webapp; Owner: postgres
--

SELECT pg_catalog.setval('webapp.socios_id_seq', 1, false);


--
-- TOC entry 3188 (class 2606 OID 16461)
-- Name: colecciones colecciones_pkey; Type: CONSTRAINT; Schema: webapp; Owner: postgres
--

ALTER TABLE ONLY webapp.colecciones
    ADD CONSTRAINT colecciones_pkey PRIMARY KEY (id);


--
-- TOC entry 3186 (class 2606 OID 16452)
-- Name: socios socios_pkey; Type: CONSTRAINT; Schema: webapp; Owner: postgres
--

ALTER TABLE ONLY webapp.socios
    ADD CONSTRAINT socios_pkey PRIMARY KEY (id);


-- Completed on 2023-01-16 17:47:24

--
-- PostgreSQL database dump complete
--

