SELECT SupplierID, ProductName, Price 
FROM [Products]
WHERE
SupplierID IN (2, 4)
ORDER BY Price DESC