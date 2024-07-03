
DROP TABLE IF EXISTS hotel;

CREATE TABLE hotel (
    hotel_id SERIAL PRIMARY KEY,
    hotel_name VARCHAR(255) NOT NULL,
    hotel_address VARCHAR(255) NOT NULL
);

INSERT INTO hotel (hotel_name, hotel_address) 
VALUES ('Hotel Sweet Dreams', 'Calle 9 de octubre y Carchi');

INSERT INTO hotel (hotel_name, hotel_address) 
VALUES ('Hotel Luna Llena', 'Calle Esmeralda y la 11');

INSERT INTO hotel (hotel_name, hotel_address)
VALUES ('Hotel Esperanza', 'Calle letamendi y portete');

INSERT INTO hotel (hotel_name, hotel_address)
VALUES ('Hotel Sol de Janeiro', '15ava y noguchi');
   
INSERT INTO hotel (hotel_name, hotel_address)
VALUES ('Hotel SSL', 'Urdesa central');






