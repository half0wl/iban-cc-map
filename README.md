# IBAN Country Currency Codes

⭐ https://www.iban.com/currency-codes in machine-readable formats.

| Format | Date | Download Latest Version |
| -- | -- | -- |
| CSV | 2022-01-11 | [🔗 `2022-01-11T19%3A28%3A24.275357-IBANCcMap.csv`](https://raw.githubusercontent.com/half0wl/iban-cc-map/main/csvs/2022-01-11T19%3A28%3A24.275357-IBANCcMap.csv) |
| JSON | Not supported yet | - |
| YML | Not supported yet | - |


## Sample

### CSV

Headers:
* `Country`
* `Currency`
* `CurrencyCode`
* `CountryNumberCode`

```sh
$ head -n 12 csvs/2022-01-11T19:28:24.275357-IBANCcMap.csv
Country,Currency,CountryCode,CountryNumberCode
AFGHANISTAN,Afghani,AFN,971
ÅLAND ISLANDS,Euro,EUR,978
ALBANIA,Lek,ALL,008
ALGERIA,Algerian Dinar,DZD,012
AMERICAN SAMOA,US Dollar,USD,840
ANDORRA,Euro,EUR,978
ANGOLA,Kwanza,AOA,973
ANGUILLA,East Caribbean Dollar,XCD,951
ANTARCTICA,No universal currency,,
ANTIGUA AND BARBUDA,East Caribbean Dollar,XCD,951
ARGENTINA,Argentine Peso,ARS,032
```

## Running the extractor

The script is written in Scala. Load it into [Ammonite REPL](https://ammonite.io/)
and run `Extract.toCsv`:
```scala
$ amm --predef Extract.sc
@ Extract.toCsv
```

This will output an `timestamp-IBANCcMap.csv` file in the project root dir.

