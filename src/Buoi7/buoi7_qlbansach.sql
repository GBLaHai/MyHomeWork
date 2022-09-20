create database db_qlbansach;
use db_qlbansach;

create table khach_hang(
	ma_kh int auto_increment,
    tai_khoan varchar(255) not null,
    mat_khau varchar(100) not null,
    email varchar(255),
    dia_chi varchar(255) not null,
    ho_ten varchar(255) not null,
    ngay_sinh date not null,
    gioi_tinh varchar(5) not null,
    dien_thoai varchar(12) not null,
    primary key (ma_kh)
);

create table don_hang(
	ma_don_hang int auto_increment,
    da_thanh_toan bool default false,
    tinh_trang_gh bit default 1, 
    /* 	1: dang chuan bi don hang 
		2: dang van chuyen den kho
        3: da den kho
        4: da roi kho
        5: dang den
        6: da hoan thanh
	*/
    ngay_dat timestamp default now(),
    ngay_giao timestamp,
    ma_kh int,
    primary key (ma_don_hang),
    foreign key (ma_kh) references khach_hang(ma_kh),
    constraint chk_ngay_giao check (ngay_giao >= ngay_dat),
    constraint chk_tinh_trang_gh check (tinh_trang_gh >= 1 and tinh_trang_gh <= 6)
);

create table chu_de (
	ma_chu_de int auto_increment,
    ten_chu_de varchar(255) not null,
    primary key (ma_chu_de)
);

create table tac_gia (
	ma_tac_gia int auto_increment,
    ten_tac_gia varchar(255) not null,
    dia_chi varchar(255) not null,
    tieu_su varchar(255),
    dien_thoai varchar(12) not null,
    primary key (ma_tac_gia)
);

create table nha_xuat_ban (
	ma_nxb int auto_increment,
    ten_nxb varchar(255) not null,
    dia_chi varchar(255) not null,
    dien_thoai varchar(12) not null,
    primary key (ma_nxb)
);

create table sach (
	ma_sach int auto_increment,
    ten_sach varchar(255) not null,
    gia_ban float not null,
    mo_ta text not null,
    anh_bia text not null,
    ngay_cap_nhat timestamp default now(),
    so_luong_ton long not null,
    ma_chu_de int not null,
    ma_nxb int not null,
    primary key (ma_sach),
    foreign key (ma_chu_de) references chu_de(ma_chu_de),
    foreign key (ma_nxb) references nha_xuat_ban(ma_nxb),
    constraint chk_gia_ban check (gia_ban >= 0),
    constraint chk_so_luong_ton check (so_luong_ton >= 0)
);

create table chi_tiet_don_hang(
	ma_don_hang int not null,
    ma_sach int not null,
    so_luong int not null,
    don_gia double not null,
    primary key (ma_don_hang, ma_sach),
    foreign key (ma_don_hang) references don_hang(ma_don_hang),
    foreign key (ma_sach) references sach(ma_sach),
    constraint chk_so_luong check (so_luong >= 0),
    constraint chk_don_gia check (don_gia >= 0)
);

create table tham_gia(
	ma_sach int not null,
    ma_tac_gia int not null,
    vai_tro varchar(255) not null,
    vi_tri varchar(255) not null,
    primary key (ma_sach, ma_tac_gia),
    foreign key (ma_sach) references sach(ma_sach),
    foreign key (ma_tac_gia) references tac_gia(ma_tac_gia)
);


