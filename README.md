# IBAN Country->Currency Code Map

https://www.iban.com/currency-codes in CSV format.

Latest CSV:


## Running the extractor

The script is written in Scala. Load it into [Ammonite REPL](https://ammonite.io/)
and run `Extract.toCsv`:
```scala
$ amm --predef Extract.sc
@ Extract.toCsv
```

This will output an `timestamp-IBANCcMap.csv` file in the project root dir.

