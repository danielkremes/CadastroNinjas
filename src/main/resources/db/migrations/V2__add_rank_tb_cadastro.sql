-- V2: Migration for add column rank in table "tb_cadastro"

ALTER TABLE tb_cadastro ADD COLUMN "rank" VARCHAR(255);
