
# Transferencia Bancaria Validator

Este proyecto contiene un programa en Java que valida cadenas de transferencia bancaria utilizando una expresión regular. El objetivo es asegurar que los datos ingresados sean válidos y cumplan con el formato especificado.

## Expresión Regular

La expresión regular utilizada para validar las cadenas de transferencia bancaria es la siguiente:

```regex
^\d{13}\|\d{8}\|\d{15}\|\d{10}\|[a-zA-Z\s]+\|\d{10}\|[a-zA-Z\s]+\|\d+(\.\d{1,2})?\|[A-Z]{3}$
```

### Desglose de la Expresión Regular

- `^\d{13}`: Valida que el DPI sea un número de exactamente 13 dígitos.
- `\|`: Separador que indica el carácter '|'.
- `\d{8}`: Valida que el número de teléfono sea un número de exactamente 8 dígitos.
- `\|`: Separador que indica el carácter '|'.
- `\d{15}`: Valida que el IMEI del dispositivo sea un número de exactamente 15 dígitos.
- `\|`: Separador que indica el carácter '|'.
- `\d{10}`: Valida que la cuenta de origen sea un número de exactamente 10 dígitos.
- `\|`: Separador que indica el carácter '|'.
- `[a-zA-Z\s]+`: Valida que el nombre del banco de origen contenga letras y espacios.
- `\|`: Separador que indica el carácter '|'.
- `\d{10}`: Valida que la cuenta de destino sea un número de exactamente 10 dígitos.
- `\|`: Separador que indica el carácter '|'.
- `[a-zA-Z\s]+`: Valida que el nombre del banco de destino contenga letras y espacios.
- `\|`: Separador que indica el carácter '|'.
- `\d+(\.\d{1,2})?`: Valida que el monto sea un número entero o un número con uno o dos decimales.
- `\|`: Separador que indica el carácter '|'.
- `[A-Z]{3}$`: Valida que la moneda sea un código de tres letras en mayúsculas (ej. GTQ, USD).

### Ejemplos de Cadenas Válidas

1. `1234567890123|12345678|123456789012345|1234567890|Banco Uno|0987654321|Banco Dos|1000.50|USD`
2. `9876543210987|87654321|543210987654321|0987654321|Banco Tres|1234567890|Banco Cuatro|250|GTQ`
3. `9876543210987|87654321|543210987654321|0987654321|Banco Tres|1234567890|Banco Cuatro|250|EUR`


## Contribuciones

Codigo de José Andrés García Elías 1106423


