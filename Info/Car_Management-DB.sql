--
-- PostgreSQL database cluster dump
--

-- Started on 2024-11-25 17:10:26

SET default_transaction_read_only = off;

SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;

--
-- Roles
--

CREATE ROLE hadi;
ALTER ROLE hadi WITH SUPERUSER INHERIT CREATEROLE CREATEDB LOGIN NOREPLICATION BYPASSRLS PASSWORD 'SCRAM-SHA-256$4096:1TBamzuBiSe54JAXMtewrA==$BAbKjdcQKo1fL75MM7B8OkpKv22hnrcbsgo0qgvSv2w=:Sfjbe4Bz8kdxScm7F+8GFxommKVretnRW5jd7q5x61k=';
CREATE ROLE postgres;
ALTER ROLE postgres WITH SUPERUSER INHERIT CREATEROLE CREATEDB LOGIN REPLICATION BYPASSRLS PASSWORD 'SCRAM-SHA-256$4096:tIg+bplKtOWNdkPNUEXiPQ==$38f0mvMrgbhBQfcP54+kFv5ulqum/wjlQjfVLDY70C4=:vwUQZ7iPLTaUfufoPQqAwn3WRPQsXIqYNbAkwDp37j4=';

--
-- User Configurations
--








--
-- Databases
--

--
-- Database "template1" dump
--

\connect template1

--
-- PostgreSQL database dump
--

-- Dumped from database version 16.3
-- Dumped by pg_dump version 16.3

-- Started on 2024-11-25 17:10:26

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

-- Completed on 2024-11-25 17:10:26

--
-- PostgreSQL database dump complete
--

--
-- Database "postgres" dump
--

\connect postgres

--
-- PostgreSQL database dump
--

-- Dumped from database version 16.3
-- Dumped by pg_dump version 16.3

-- Started on 2024-11-25 17:10:26

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
-- TOC entry 7 (class 2615 OID 16398)
-- Name: vt; Type: SCHEMA; Schema: -; Owner: postgres
--

CREATE SCHEMA vt;


ALTER SCHEMA vt OWNER TO postgres;

--
-- TOC entry 2 (class 3079 OID 16384)
-- Name: adminpack; Type: EXTENSION; Schema: -; Owner: -
--

CREATE EXTENSION IF NOT EXISTS adminpack WITH SCHEMA pg_catalog;


--
-- TOC entry 4994 (class 0 OID 0)
-- Dependencies: 2
-- Name: EXTENSION adminpack; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION adminpack IS 'administrative functions for PostgreSQL';


SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 234 (class 1259 OID 16539)
-- Name: calls; Type: TABLE; Schema: vt; Owner: postgres
--

CREATE TABLE vt.calls (
    trow_no integer NOT NULL,
    t_name character varying(10) NOT NULL,
    essn character varying(10) NOT NULL
);


ALTER TABLE vt.calls OWNER TO postgres;

--
-- TOC entry 233 (class 1259 OID 16538)
-- Name: calls_trow_no_seq; Type: SEQUENCE; Schema: vt; Owner: postgres
--

CREATE SEQUENCE vt.calls_trow_no_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE vt.calls_trow_no_seq OWNER TO postgres;

--
-- TOC entry 4995 (class 0 OID 0)
-- Dependencies: 233
-- Name: calls_trow_no_seq; Type: SEQUENCE OWNED BY; Schema: vt; Owner: postgres
--

ALTER SEQUENCE vt.calls_trow_no_seq OWNED BY vt.calls.trow_no;


--
-- TOC entry 218 (class 1259 OID 16406)
-- Name: car; Type: TABLE; Schema: vt; Owner: postgres
--

CREATE TABLE vt.car (
    brand character varying(15) NOT NULL,
    color character varying(10) NOT NULL,
    platenumber character varying(10) NOT NULL,
    stateofcar character varying(15) NOT NULL,
    clearencedate date NOT NULL,
    maintenanceconame character varying(15),
    maintenancedate date,
    insuranceconame character varying(15),
    insurancedate date
);


ALTER TABLE vt.car OWNER TO postgres;

--
-- TOC entry 232 (class 1259 OID 16522)
-- Name: drives; Type: TABLE; Schema: vt; Owner: postgres
--

CREATE TABLE vt.drives (
    erow_no integer NOT NULL,
    platenumber character varying(10) NOT NULL,
    essn character varying(10) NOT NULL
);


ALTER TABLE vt.drives OWNER TO postgres;

--
-- TOC entry 231 (class 1259 OID 16521)
-- Name: drives_erow_no_seq; Type: SEQUENCE; Schema: vt; Owner: postgres
--

CREATE SEQUENCE vt.drives_erow_no_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE vt.drives_erow_no_seq OWNER TO postgres;

--
-- TOC entry 4996 (class 0 OID 0)
-- Dependencies: 231
-- Name: drives_erow_no_seq; Type: SEQUENCE OWNED BY; Schema: vt; Owner: postgres
--

ALTER SEQUENCE vt.drives_erow_no_seq OWNED BY vt.drives.erow_no;


--
-- TOC entry 230 (class 1259 OID 16511)
-- Name: electriccars; Type: TABLE; Schema: vt; Owner: postgres
--

CREATE TABLE vt.electriccars (
    platenumber character varying(10) NOT NULL,
    capacity integer NOT NULL
);


ALTER TABLE vt.electriccars OWNER TO postgres;

--
-- TOC entry 217 (class 1259 OID 16399)
-- Name: employee; Type: TABLE; Schema: vt; Owner: postgres
--

CREATE TABLE vt.employee (
    fname character varying(15),
    mname character varying(15),
    lname character varying(15),
    ssn character varying(10) NOT NULL,
    phonenumber character varying(10),
    birthdate date,
    gender character varying(10),
    address character varying(50)
);


ALTER TABLE vt.employee OWNER TO postgres;

--
-- TOC entry 229 (class 1259 OID 16501)
-- Name: fueledcars; Type: TABLE; Schema: vt; Owner: postgres
--

CREATE TABLE vt.fueledcars (
    platenumber character varying(10) NOT NULL,
    fueltype character varying(10) NOT NULL
);


ALTER TABLE vt.fueledcars OWNER TO postgres;

--
-- TOC entry 227 (class 1259 OID 16480)
-- Name: fulltimeemployee; Type: TABLE; Schema: vt; Owner: postgres
--

CREATE TABLE vt.fulltimeemployee (
    essn character varying(10) NOT NULL,
    salary numeric(10,2) NOT NULL
);


ALTER TABLE vt.fulltimeemployee OWNER TO postgres;

--
-- TOC entry 219 (class 1259 OID 16411)
-- Name: gasstation; Type: TABLE; Schema: vt; Owner: postgres
--

CREATE TABLE vt.gasstation (
    g_name character varying(10) NOT NULL,
    phonenumber character varying(10) NOT NULL,
    price numeric(5,2) DEFAULT 10 NOT NULL
);


ALTER TABLE vt.gasstation OWNER TO postgres;

--
-- TOC entry 224 (class 1259 OID 16450)
-- Name: gasstationlocations; Type: TABLE; Schema: vt; Owner: postgres
--

CREATE TABLE vt.gasstationlocations (
    g_name character varying(10) NOT NULL,
    physical_location character varying(20) NOT NULL
);


ALTER TABLE vt.gasstationlocations OWNER TO postgres;

--
-- TOC entry 222 (class 1259 OID 16433)
-- Name: insurancecompany; Type: TABLE; Schema: vt; Owner: postgres
--

CREATE TABLE vt.insurancecompany (
    price numeric(5,2) NOT NULL,
    address character varying(20) NOT NULL,
    i_name character varying(20) NOT NULL,
    phonenumber character varying(10) NOT NULL
);


ALTER TABLE vt.insurancecompany OWNER TO postgres;

--
-- TOC entry 220 (class 1259 OID 16419)
-- Name: maintenancecompany; Type: TABLE; Schema: vt; Owner: postgres
--

CREATE TABLE vt.maintenancecompany (
    m_name character varying(10) NOT NULL,
    phonenumber character varying(10) NOT NULL,
    price numeric(5,2) NOT NULL
);


ALTER TABLE vt.maintenancecompany OWNER TO postgres;

--
-- TOC entry 223 (class 1259 OID 16440)
-- Name: maintenancelocations; Type: TABLE; Schema: vt; Owner: postgres
--

CREATE TABLE vt.maintenancelocations (
    m_name character varying(10) NOT NULL,
    physical_location character varying(20) NOT NULL
);


ALTER TABLE vt.maintenancelocations OWNER TO postgres;

--
-- TOC entry 226 (class 1259 OID 16470)
-- Name: manager; Type: TABLE; Schema: vt; Owner: postgres
--

CREATE TABLE vt.manager (
    essn character varying(10) NOT NULL,
    officenumber character varying(10) NOT NULL,
    startdate date NOT NULL
);


ALTER TABLE vt.manager OWNER TO postgres;

--
-- TOC entry 228 (class 1259 OID 16490)
-- Name: parttimeemployee; Type: TABLE; Schema: vt; Owner: postgres
--

CREATE TABLE vt.parttimeemployee (
    essn character varying(10) NOT NULL,
    hoursworked integer NOT NULL,
    wageperhour numeric(10,2) DEFAULT 0 NOT NULL
);


ALTER TABLE vt.parttimeemployee OWNER TO postgres;

--
-- TOC entry 225 (class 1259 OID 16460)
-- Name: staff; Type: TABLE; Schema: vt; Owner: postgres
--

CREATE TABLE vt.staff (
    essn character varying(10) NOT NULL,
    major character varying(25) NOT NULL
);


ALTER TABLE vt.staff OWNER TO postgres;

--
-- TOC entry 236 (class 1259 OID 16556)
-- Name: supplies; Type: TABLE; Schema: vt; Owner: postgres
--

CREATE TABLE vt.supplies (
    grow_no integer NOT NULL,
    g_name character varying(10) NOT NULL,
    platenumber character varying(10) NOT NULL,
    coupon character varying(10)
);


ALTER TABLE vt.supplies OWNER TO postgres;

--
-- TOC entry 235 (class 1259 OID 16555)
-- Name: supplies_grow_no_seq; Type: SEQUENCE; Schema: vt; Owner: postgres
--

CREATE SEQUENCE vt.supplies_grow_no_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE vt.supplies_grow_no_seq OWNER TO postgres;

--
-- TOC entry 4997 (class 0 OID 0)
-- Dependencies: 235
-- Name: supplies_grow_no_seq; Type: SEQUENCE OWNED BY; Schema: vt; Owner: postgres
--

ALTER SEQUENCE vt.supplies_grow_no_seq OWNED BY vt.supplies.grow_no;


--
-- TOC entry 221 (class 1259 OID 16426)
-- Name: taxibereau; Type: TABLE; Schema: vt; Owner: postgres
--

CREATE TABLE vt.taxibereau (
    t_name character varying(10) NOT NULL,
    phonenumber character varying(10) NOT NULL,
    address character varying(20) NOT NULL,
    price numeric(5,2) NOT NULL
);


ALTER TABLE vt.taxibereau OWNER TO postgres;

--
-- TOC entry 237 (class 1259 OID 16582)
-- Name: userpassword; Type: TABLE; Schema: vt; Owner: postgres
--

CREATE TABLE vt.userpassword (
    username character varying(30),
    passcode character varying(30)
);


ALTER TABLE vt.userpassword OWNER TO postgres;

--
-- TOC entry 4763 (class 2604 OID 16542)
-- Name: calls trow_no; Type: DEFAULT; Schema: vt; Owner: postgres
--

ALTER TABLE ONLY vt.calls ALTER COLUMN trow_no SET DEFAULT nextval('vt.calls_trow_no_seq'::regclass);


--
-- TOC entry 4762 (class 2604 OID 16525)
-- Name: drives erow_no; Type: DEFAULT; Schema: vt; Owner: postgres
--

ALTER TABLE ONLY vt.drives ALTER COLUMN erow_no SET DEFAULT nextval('vt.drives_erow_no_seq'::regclass);


--
-- TOC entry 4764 (class 2604 OID 16559)
-- Name: supplies grow_no; Type: DEFAULT; Schema: vt; Owner: postgres
--

ALTER TABLE ONLY vt.supplies ALTER COLUMN grow_no SET DEFAULT nextval('vt.supplies_grow_no_seq'::regclass);


--
-- TOC entry 4985 (class 0 OID 16539)
-- Dependencies: 234
-- Data for Name: calls; Type: TABLE DATA; Schema: vt; Owner: postgres
--

COPY vt.calls (trow_no, t_name, essn) FROM stdin;
1	Etimad	1234567890
2	AlNajah	9876543210
3	Etimad	9876543210
4	Etimad	3456789012
5	Almadinah	1234567890
\.


--
-- TOC entry 4969 (class 0 OID 16406)
-- Dependencies: 218
-- Data for Name: car; Type: TABLE DATA; Schema: vt; Owner: postgres
--

COPY vt.car (brand, color, platenumber, stateofcar, clearencedate, maintenanceconame, maintenancedate, insuranceconame, insurancedate) FROM stdin;
Toyota	Blue	ABC123	Available	2018-01-01	NumberOne	2022-01-05	Al Mashreq	2024-01-01
Skoda	Red	XYZ789	UnAvailable	2019-12-01	NumberOne	2022-02-15	Al Mashreq	2024-03-01
Kia	white	DEF456	UnAvailable	2020-02-01	NumberOne	2022-02-05	Al Mashreq	2024-02-27
Hyundai	Black	GHI789	Available	2021-07-08	NumberOne	2022-01-28	Al Mashreq	2024-09-17
Seat	Silver	JKL012	UnAvailable	2017-03-01	NumberOne	2022-03-05	Al Mashreq	2024-04-30
Toyota	Blue	34679H	Available	2023-01-15	NumberOne	2023-01-20	Al Mashreq	2023-01-25
Honda	Red	26485N	UnAvailable	2023-02-10	TopService	2023-02-15	Al Mashreq	2023-02-20
Ford	Green	N75469	Available	2023-03-05	SpeedFix	2023-03-10	Al Mashreq	2023-03-15
Chevrolet	Yellow	41578L	UnAvailable	2023-04-20	QuickFix	2023-04-25	Al Mashreq	2023-05-01
Nissan	Black	72036K	Available	2023-05-10	NumberOne	2023-05-15	Al Mashreq	2023-05-20
\.


--
-- TOC entry 4983 (class 0 OID 16522)
-- Dependencies: 232
-- Data for Name: drives; Type: TABLE DATA; Schema: vt; Owner: postgres
--

COPY vt.drives (erow_no, platenumber, essn) FROM stdin;
1	ABC123	1234567890
2	N75469	9876543210
3	DEF456	1234567890
4	GHI789	3456789012
5	JKL012	2345678901
\.


--
-- TOC entry 4981 (class 0 OID 16511)
-- Dependencies: 230
-- Data for Name: electriccars; Type: TABLE DATA; Schema: vt; Owner: postgres
--

COPY vt.electriccars (platenumber, capacity) FROM stdin;
34679H	60
26485N	75
N75469	80
41578L	70
72036K	65
\.


--
-- TOC entry 4968 (class 0 OID 16399)
-- Dependencies: 217
-- Data for Name: employee; Type: TABLE DATA; Schema: vt; Owner: postgres
--

COPY vt.employee (fname, mname, lname, ssn, phonenumber, birthdate, gender, address) FROM stdin;
Mohammad	Sameh	Kareem	1234567890	5551234567	1990-05-15	Male	Rafidia St
Sara	Abdulkareem	Saleem	9876543210	5559876543	1985-08-20	Female	Amman St
Hala	Saeed	Kamel	5678901234	5551112233	1995-02-10	Female	Sufian St
Robert	Downey	Junior	3456789012	\N	1980-11-30	Male	NYC Manhattan
Suaad	Ramez	Abdulrazzaq	2345678901	5553334444	1998-07-05	Female	Gaza St
Fred	Michael	Watson	1112223334	5551744567	1990-05-15	Male	123 Main St
Jane	Smach	Smith	5556667778	5559885543	1985-08-20	Female	456 Oak St
Roben	Suna	Johnson	9991010101	5551142233	1995-02-10	Female	789 Maple Ave
Barney	Jimmy	Stinson	1122334455	5599878526	1980-11-30	Male	101 Pine St
Ted	J	Mosby	1221344367	5547934444	1998-07-05	Female	202 Cedar Rd
\.


--
-- TOC entry 4980 (class 0 OID 16501)
-- Dependencies: 229
-- Data for Name: fueledcars; Type: TABLE DATA; Schema: vt; Owner: postgres
--

COPY vt.fueledcars (platenumber, fueltype) FROM stdin;
ABC123	Gasoline
XYZ789	Deisel
DEF456	Diesel
GHI789	Deisel
JKL012	Gasoline
\.


--
-- TOC entry 4978 (class 0 OID 16480)
-- Dependencies: 227
-- Data for Name: fulltimeemployee; Type: TABLE DATA; Schema: vt; Owner: postgres
--

COPY vt.fulltimeemployee (essn, salary) FROM stdin;
1234567890	5000.00
9876543210	6000.00
5678901234	5500.00
3456789012	6500.00
2345678901	7000.00
\.


--
-- TOC entry 4970 (class 0 OID 16411)
-- Dependencies: 219
-- Data for Name: gasstation; Type: TABLE DATA; Schema: vt; Owner: postgres
--

COPY vt.gasstation (g_name, phonenumber, price) FROM stdin;
AlHuda	1234567890	6.50
AlTamimi	9876543210	15.00
Shakaa	5551112233	12.50
AlMaseer	5554445555	14.00
Kanaan	7778889999	11.50
\.


--
-- TOC entry 4975 (class 0 OID 16450)
-- Dependencies: 224
-- Data for Name: gasstationlocations; Type: TABLE DATA; Schema: vt; Owner: postgres
--

COPY vt.gasstationlocations (g_name, physical_location) FROM stdin;
AlHuda	Zawata
Shakaa	DownTown
AlHuda	Ramallah
AlHuda	Jenin
AlTamimi	bietWazan St
\.


--
-- TOC entry 4973 (class 0 OID 16433)
-- Dependencies: 222
-- Data for Name: insurancecompany; Type: TABLE DATA; Schema: vt; Owner: postgres
--

COPY vt.insurancecompany (price, address, i_name, phonenumber) FROM stdin;
100.00	Faisal St	Al Mashreq	022958090
150.00	456 Oak St	SecureGuard	9876543210
120.00	789 Maple	Shield	5551112233
130.00	101 Pine St	SafeCoverage	5554445555
110.00	202 Cedar Rd	Guardian	7778889999
\.


--
-- TOC entry 4971 (class 0 OID 16419)
-- Dependencies: 220
-- Data for Name: maintenancecompany; Type: TABLE DATA; Schema: vt; Owner: postgres
--

COPY vt.maintenancecompany (m_name, phonenumber, price) FROM stdin;
NumberOne	12345890	150.00
TopService	98765210	200.00
SpeedFix	55511233	180.00
QuickFix	55544555	170.00
RapidS	77788899	160.00
\.


--
-- TOC entry 4974 (class 0 OID 16440)
-- Dependencies: 223
-- Data for Name: maintenancelocations; Type: TABLE DATA; Schema: vt; Owner: postgres
--

COPY vt.maintenancelocations (m_name, physical_location) FROM stdin;
NumberOne	Ramallah
NumberOne	Nablus
SpeedFix	789 Mechanic
QuickFix	101 Auto
RapidS	202 Fix St
\.


--
-- TOC entry 4977 (class 0 OID 16470)
-- Dependencies: 226
-- Data for Name: manager; Type: TABLE DATA; Schema: vt; Owner: postgres
--

COPY vt.manager (essn, officenumber, startdate) FROM stdin;
1234567890	Office101	2022-01-01
9876543210	Office202	2021-12-15
5678901234	Office303	2023-02-01
3456789012	Office404	2023-03-01
2345678901	Office505	2022-11-01
\.


--
-- TOC entry 4979 (class 0 OID 16490)
-- Dependencies: 228
-- Data for Name: parttimeemployee; Type: TABLE DATA; Schema: vt; Owner: postgres
--

COPY vt.parttimeemployee (essn, hoursworked, wageperhour) FROM stdin;
1112223334	22	14.50
5556667778	18	11.25
9991010101	25	16.00
1122334455	20	13.00
1221344367	28	15.75
\.


--
-- TOC entry 4976 (class 0 OID 16460)
-- Dependencies: 225
-- Data for Name: staff; Type: TABLE DATA; Schema: vt; Owner: postgres
--

COPY vt.staff (essn, major) FROM stdin;
1234567890	Computer Science
9876543210	Computer Eng
5678901234	CyberSicurity
3456789012	Electrical Eng
2345678901	Physics
\.


--
-- TOC entry 4987 (class 0 OID 16556)
-- Dependencies: 236
-- Data for Name: supplies; Type: TABLE DATA; Schema: vt; Owner: postgres
--

COPY vt.supplies (grow_no, g_name, platenumber, coupon) FROM stdin;
1	AlHuda	ABC123	GTHYUJK
2	AlHuda	XYZ789	HECXLKH
3	AlMaseer	DEF456	ZDQEWRTG
4	Shakaa	GHI789	PJLN9MK
5	AlHuda	JKL012	CPLMHIG
\.


--
-- TOC entry 4972 (class 0 OID 16426)
-- Dependencies: 221
-- Data for Name: taxibereau; Type: TABLE DATA; Schema: vt; Owner: postgres
--

COPY vt.taxibereau (t_name, phonenumber, address, price) FROM stdin;
Etimad	1700100200	Nablus 	15.00
Almadinah	092377777	Nablus 	25.00
AlNajah	0599280832	Nablus 	20.00
AlSalam	092382010	Al-Adl St	25.00
Jawwal	092343880	Fakhfakhina St	30.00
\.


--
-- TOC entry 4988 (class 0 OID 16582)
-- Dependencies: 237
-- Data for Name: userpassword; Type: TABLE DATA; Schema: vt; Owner: postgres
--

COPY vt.userpassword (username, passcode) FROM stdin;
Admin	Admin
\.


--
-- TOC entry 4998 (class 0 OID 0)
-- Dependencies: 233
-- Name: calls_trow_no_seq; Type: SEQUENCE SET; Schema: vt; Owner: postgres
--

SELECT pg_catalog.setval('vt.calls_trow_no_seq', 5, true);


--
-- TOC entry 4999 (class 0 OID 0)
-- Dependencies: 231
-- Name: drives_erow_no_seq; Type: SEQUENCE SET; Schema: vt; Owner: postgres
--

SELECT pg_catalog.setval('vt.drives_erow_no_seq', 5, true);


--
-- TOC entry 5000 (class 0 OID 0)
-- Dependencies: 235
-- Name: supplies_grow_no_seq; Type: SEQUENCE SET; Schema: vt; Owner: postgres
--

SELECT pg_catalog.setval('vt.supplies_grow_no_seq', 5, true);


--
-- TOC entry 4806 (class 2606 OID 16544)
-- Name: calls calls_pkey; Type: CONSTRAINT; Schema: vt; Owner: postgres
--

ALTER TABLE ONLY vt.calls
    ADD CONSTRAINT calls_pkey PRIMARY KEY (trow_no);


--
-- TOC entry 4770 (class 2606 OID 16410)
-- Name: car car_pkey; Type: CONSTRAINT; Schema: vt; Owner: postgres
--

ALTER TABLE ONLY vt.car
    ADD CONSTRAINT car_pkey PRIMARY KEY (platenumber);


--
-- TOC entry 4804 (class 2606 OID 16527)
-- Name: drives drives_pkey; Type: CONSTRAINT; Schema: vt; Owner: postgres
--

ALTER TABLE ONLY vt.drives
    ADD CONSTRAINT drives_pkey PRIMARY KEY (erow_no);


--
-- TOC entry 4802 (class 2606 OID 16515)
-- Name: electriccars electriccars_pkey; Type: CONSTRAINT; Schema: vt; Owner: postgres
--

ALTER TABLE ONLY vt.electriccars
    ADD CONSTRAINT electriccars_pkey PRIMARY KEY (platenumber, capacity);


--
-- TOC entry 4766 (class 2606 OID 16405)
-- Name: employee employee_phonenumber_key; Type: CONSTRAINT; Schema: vt; Owner: postgres
--

ALTER TABLE ONLY vt.employee
    ADD CONSTRAINT employee_phonenumber_key UNIQUE (phonenumber);


--
-- TOC entry 4768 (class 2606 OID 16403)
-- Name: employee employee_pkey; Type: CONSTRAINT; Schema: vt; Owner: postgres
--

ALTER TABLE ONLY vt.employee
    ADD CONSTRAINT employee_pkey PRIMARY KEY (ssn);


--
-- TOC entry 4800 (class 2606 OID 16505)
-- Name: fueledcars fueledcars_pkey; Type: CONSTRAINT; Schema: vt; Owner: postgres
--

ALTER TABLE ONLY vt.fueledcars
    ADD CONSTRAINT fueledcars_pkey PRIMARY KEY (platenumber, fueltype);


--
-- TOC entry 4796 (class 2606 OID 16484)
-- Name: fulltimeemployee fulltimeemployee_pkey; Type: CONSTRAINT; Schema: vt; Owner: postgres
--

ALTER TABLE ONLY vt.fulltimeemployee
    ADD CONSTRAINT fulltimeemployee_pkey PRIMARY KEY (essn, salary);


--
-- TOC entry 4772 (class 2606 OID 16418)
-- Name: gasstation gasstation_phonenumber_key; Type: CONSTRAINT; Schema: vt; Owner: postgres
--

ALTER TABLE ONLY vt.gasstation
    ADD CONSTRAINT gasstation_phonenumber_key UNIQUE (phonenumber);


--
-- TOC entry 4774 (class 2606 OID 16416)
-- Name: gasstation gasstation_pkey; Type: CONSTRAINT; Schema: vt; Owner: postgres
--

ALTER TABLE ONLY vt.gasstation
    ADD CONSTRAINT gasstation_pkey PRIMARY KEY (g_name);


--
-- TOC entry 4790 (class 2606 OID 16454)
-- Name: gasstationlocations gasstationlocations_pkey; Type: CONSTRAINT; Schema: vt; Owner: postgres
--

ALTER TABLE ONLY vt.gasstationlocations
    ADD CONSTRAINT gasstationlocations_pkey PRIMARY KEY (g_name, physical_location);


--
-- TOC entry 4784 (class 2606 OID 16439)
-- Name: insurancecompany insurancecompany_phonenumber_key; Type: CONSTRAINT; Schema: vt; Owner: postgres
--

ALTER TABLE ONLY vt.insurancecompany
    ADD CONSTRAINT insurancecompany_phonenumber_key UNIQUE (phonenumber);


--
-- TOC entry 4786 (class 2606 OID 16437)
-- Name: insurancecompany insurancecompany_pkey; Type: CONSTRAINT; Schema: vt; Owner: postgres
--

ALTER TABLE ONLY vt.insurancecompany
    ADD CONSTRAINT insurancecompany_pkey PRIMARY KEY (i_name);


--
-- TOC entry 4776 (class 2606 OID 16425)
-- Name: maintenancecompany maintenancecompany_phonenumber_key; Type: CONSTRAINT; Schema: vt; Owner: postgres
--

ALTER TABLE ONLY vt.maintenancecompany
    ADD CONSTRAINT maintenancecompany_phonenumber_key UNIQUE (phonenumber);


--
-- TOC entry 4778 (class 2606 OID 16423)
-- Name: maintenancecompany maintenancecompany_pkey; Type: CONSTRAINT; Schema: vt; Owner: postgres
--

ALTER TABLE ONLY vt.maintenancecompany
    ADD CONSTRAINT maintenancecompany_pkey PRIMARY KEY (m_name);


--
-- TOC entry 4788 (class 2606 OID 16444)
-- Name: maintenancelocations maintenancelocations_pkey; Type: CONSTRAINT; Schema: vt; Owner: postgres
--

ALTER TABLE ONLY vt.maintenancelocations
    ADD CONSTRAINT maintenancelocations_pkey PRIMARY KEY (m_name, physical_location);


--
-- TOC entry 4794 (class 2606 OID 16474)
-- Name: manager manager_pkey; Type: CONSTRAINT; Schema: vt; Owner: postgres
--

ALTER TABLE ONLY vt.manager
    ADD CONSTRAINT manager_pkey PRIMARY KEY (essn, officenumber);


--
-- TOC entry 4798 (class 2606 OID 16495)
-- Name: parttimeemployee parttimeemployee_pkey; Type: CONSTRAINT; Schema: vt; Owner: postgres
--

ALTER TABLE ONLY vt.parttimeemployee
    ADD CONSTRAINT parttimeemployee_pkey PRIMARY KEY (essn, hoursworked);


--
-- TOC entry 4792 (class 2606 OID 16464)
-- Name: staff staff_pkey; Type: CONSTRAINT; Schema: vt; Owner: postgres
--

ALTER TABLE ONLY vt.staff
    ADD CONSTRAINT staff_pkey PRIMARY KEY (essn, major);


--
-- TOC entry 4808 (class 2606 OID 16561)
-- Name: supplies supplies_pkey; Type: CONSTRAINT; Schema: vt; Owner: postgres
--

ALTER TABLE ONLY vt.supplies
    ADD CONSTRAINT supplies_pkey PRIMARY KEY (grow_no);


--
-- TOC entry 4780 (class 2606 OID 16432)
-- Name: taxibereau taxibereau_phonenumber_key; Type: CONSTRAINT; Schema: vt; Owner: postgres
--

ALTER TABLE ONLY vt.taxibereau
    ADD CONSTRAINT taxibereau_phonenumber_key UNIQUE (phonenumber);


--
-- TOC entry 4782 (class 2606 OID 16430)
-- Name: taxibereau taxibereau_pkey; Type: CONSTRAINT; Schema: vt; Owner: postgres
--

ALTER TABLE ONLY vt.taxibereau
    ADD CONSTRAINT taxibereau_pkey PRIMARY KEY (t_name);


--
-- TOC entry 4821 (class 2606 OID 16550)
-- Name: calls calls_essn_fkey; Type: FK CONSTRAINT; Schema: vt; Owner: postgres
--

ALTER TABLE ONLY vt.calls
    ADD CONSTRAINT calls_essn_fkey FOREIGN KEY (essn) REFERENCES vt.employee(ssn) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- TOC entry 4822 (class 2606 OID 16545)
-- Name: calls calls_t_name_fkey; Type: FK CONSTRAINT; Schema: vt; Owner: postgres
--

ALTER TABLE ONLY vt.calls
    ADD CONSTRAINT calls_t_name_fkey FOREIGN KEY (t_name) REFERENCES vt.taxibereau(t_name) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- TOC entry 4819 (class 2606 OID 16533)
-- Name: drives drives_essn_fkey; Type: FK CONSTRAINT; Schema: vt; Owner: postgres
--

ALTER TABLE ONLY vt.drives
    ADD CONSTRAINT drives_essn_fkey FOREIGN KEY (essn) REFERENCES vt.employee(ssn) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- TOC entry 4820 (class 2606 OID 16528)
-- Name: drives drives_platenumber_fkey; Type: FK CONSTRAINT; Schema: vt; Owner: postgres
--

ALTER TABLE ONLY vt.drives
    ADD CONSTRAINT drives_platenumber_fkey FOREIGN KEY (platenumber) REFERENCES vt.car(platenumber) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- TOC entry 4818 (class 2606 OID 16516)
-- Name: electriccars electriccars_platenumber_fkey; Type: FK CONSTRAINT; Schema: vt; Owner: postgres
--

ALTER TABLE ONLY vt.electriccars
    ADD CONSTRAINT electriccars_platenumber_fkey FOREIGN KEY (platenumber) REFERENCES vt.car(platenumber) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- TOC entry 4809 (class 2606 OID 16572)
-- Name: car fk_const1; Type: FK CONSTRAINT; Schema: vt; Owner: postgres
--

ALTER TABLE ONLY vt.car
    ADD CONSTRAINT fk_const1 FOREIGN KEY (maintenanceconame) REFERENCES vt.maintenancecompany(m_name) ON UPDATE CASCADE ON DELETE SET NULL;


--
-- TOC entry 4810 (class 2606 OID 16577)
-- Name: car fk_const2; Type: FK CONSTRAINT; Schema: vt; Owner: postgres
--

ALTER TABLE ONLY vt.car
    ADD CONSTRAINT fk_const2 FOREIGN KEY (insuranceconame) REFERENCES vt.insurancecompany(i_name) ON UPDATE CASCADE ON DELETE SET NULL;


--
-- TOC entry 4817 (class 2606 OID 16506)
-- Name: fueledcars fueledcars_platenumber_fkey; Type: FK CONSTRAINT; Schema: vt; Owner: postgres
--

ALTER TABLE ONLY vt.fueledcars
    ADD CONSTRAINT fueledcars_platenumber_fkey FOREIGN KEY (platenumber) REFERENCES vt.car(platenumber) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- TOC entry 4815 (class 2606 OID 16485)
-- Name: fulltimeemployee fulltimeemployee_essn_fkey; Type: FK CONSTRAINT; Schema: vt; Owner: postgres
--

ALTER TABLE ONLY vt.fulltimeemployee
    ADD CONSTRAINT fulltimeemployee_essn_fkey FOREIGN KEY (essn) REFERENCES vt.employee(ssn) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- TOC entry 4812 (class 2606 OID 16455)
-- Name: gasstationlocations gasstationlocations_g_name_fkey; Type: FK CONSTRAINT; Schema: vt; Owner: postgres
--

ALTER TABLE ONLY vt.gasstationlocations
    ADD CONSTRAINT gasstationlocations_g_name_fkey FOREIGN KEY (g_name) REFERENCES vt.gasstation(g_name) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- TOC entry 4811 (class 2606 OID 16445)
-- Name: maintenancelocations maintenancelocations_m_name_fkey; Type: FK CONSTRAINT; Schema: vt; Owner: postgres
--

ALTER TABLE ONLY vt.maintenancelocations
    ADD CONSTRAINT maintenancelocations_m_name_fkey FOREIGN KEY (m_name) REFERENCES vt.maintenancecompany(m_name) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- TOC entry 4814 (class 2606 OID 16475)
-- Name: manager manager_essn_fkey; Type: FK CONSTRAINT; Schema: vt; Owner: postgres
--

ALTER TABLE ONLY vt.manager
    ADD CONSTRAINT manager_essn_fkey FOREIGN KEY (essn) REFERENCES vt.employee(ssn) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- TOC entry 4816 (class 2606 OID 16496)
-- Name: parttimeemployee parttimeemployee_essn_fkey; Type: FK CONSTRAINT; Schema: vt; Owner: postgres
--

ALTER TABLE ONLY vt.parttimeemployee
    ADD CONSTRAINT parttimeemployee_essn_fkey FOREIGN KEY (essn) REFERENCES vt.employee(ssn) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- TOC entry 4813 (class 2606 OID 16465)
-- Name: staff staff_essn_fkey; Type: FK CONSTRAINT; Schema: vt; Owner: postgres
--

ALTER TABLE ONLY vt.staff
    ADD CONSTRAINT staff_essn_fkey FOREIGN KEY (essn) REFERENCES vt.employee(ssn) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- TOC entry 4823 (class 2606 OID 16562)
-- Name: supplies supplies_g_name_fkey; Type: FK CONSTRAINT; Schema: vt; Owner: postgres
--

ALTER TABLE ONLY vt.supplies
    ADD CONSTRAINT supplies_g_name_fkey FOREIGN KEY (g_name) REFERENCES vt.gasstation(g_name) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- TOC entry 4824 (class 2606 OID 16567)
-- Name: supplies supplies_platenumber_fkey; Type: FK CONSTRAINT; Schema: vt; Owner: postgres
--

ALTER TABLE ONLY vt.supplies
    ADD CONSTRAINT supplies_platenumber_fkey FOREIGN KEY (platenumber) REFERENCES vt.car(platenumber) ON UPDATE CASCADE ON DELETE CASCADE;


-- Completed on 2024-11-25 17:10:26

--
-- PostgreSQL database dump complete
--

-- Completed on 2024-11-25 17:10:26

--
-- PostgreSQL database cluster dump complete
--

