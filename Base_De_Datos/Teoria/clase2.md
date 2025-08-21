# SQL
Structured Query Language, (lenguaje de consultas estructuradas) tiene 3 sub lenguajes de consulta:
* LDD/DDL 
* DML/DML 
* LCD/DCL 

```sql
SELECT 
    CURTIME() AS 'CURTIME',
    NOW() AS 'NOW',
    DAYNAME(NOW()) AS 'DAY NAME',
    DAYOFMONTH(NOW()) AS 'DIA/MES',
    DAYOFWEEk(NOW()) AS 'DIA/SEMANA',
    DAYOFYEAR(NOW()) AS 'DIA/AÑO'
    MONTH(NOW()) AS 'MES/AÑO',
    YEAR(NOW()) AS 'AÑO',
    DAYNAME('1900-01-01') as 'DAY';
```
