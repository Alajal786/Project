CREATE TABLE loan_service (
    customer_id INT PRIMARY KEY,
    name VARCHAR(40),
    email VARCHAR(100),
    mobile_number VARCHAR(15),
    monthly_income DECIMAL(10,2),
    loan_avai DECIMAL(10,2),
    pancard VARCHAR(10),
    FOREIGN KEY (pancard) REFERENCES credit_score(pancard)
);

INSERT INTO loan_service(customer_id, name, email, mobile_number, monthly_income, loan_avai, pancard)
VALUES (1, 'James Gosling', 'james.gosling@example.com', '9876543210', 85000.00, 500000.00, 'ABCD12345');

INSERT INTO loan_service(customer_id, name, email, mobile_number, monthly_income, loan_avai, pancard)
VALUES (2, 'Dennis Ritchie', 'dennis.ritchie@example.com', '9123456780', 95000.00, 750000.00, 'BLUP12356');