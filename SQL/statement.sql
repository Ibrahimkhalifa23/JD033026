USE jd_bank_system;

select * from accounts; -- select all columns and records from the table "accounts"

select * from accounts -- select all accounts that have a balance over 10000.00
where balance > 10000.00;

select id,customer_id,balance from accounts -- select customers with a savings account and an active status with a balance over 10000. List their balance in descending order (from higher to lower balance)
where type = 'SAVINGS' and status='Active' and balance>10000.00
Order by balance Desc;

Select sum(balance) as total_balance -- select the total balance of all customers combined.
from accounts;

select*from audit_logs; -- select all the records on the audit_logs table

SELECT accounts.customer_id, audit_logs.action
FROM accounts
         INNER JOIN audit_logs
                    ON accounts.id = audit_logs.account_id
WHERE audit_logs.action = 'ACCOUNT_OPENED'; -- select the customers with an "Account_Opened" action as their audit_log.

select customer_id from accounts -- combine the customers id with their respective audit_log id.
                            inner join action on audit_logs.id = audit_logs.id;
