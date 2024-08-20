part of : import java.text.*;

getInstance(): Returns a general-purpose number formatter for the default locale.
NumberFormat nf = NumberFormat.getInstance(); // returns in a code to format it, use .format

getCurrencyInstance(): Returns a currency formatter for the default locale.
NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();  // returns in a code to format it, use .format

getPercentInstance(): Returns a percentage formatter for the default locale.
NumberFormat percentFormatter = NumberFormat.getPercentInstance();  // returns in a code to format it, use .format

format(double number): Formats a number as a String.  
String formattedNumber = nf.format(1234.56);


Usage Scenarios
General Number Formatting: Use getInstance() or getNumberInstance().
Currency Formatting: Use getCurrencyInstance().
Percentage Formatting: Use getPercentInstance().
Integer-Only Formatting: Use getIntegerInstance().

Locale 
Locale locale = new Locale("en"); // English  Creates a locale for a specific language.
Locale locale = new Locale("en", "IN"); // English ( Inida) // Creates a locale for a specific language and country.

Predefined Locales:
Java provides some commonly used locales as constants:
Locale.US: English (United States)
Locale.UK: English (United Kingdom)
Locale.CANADA: English (Canada)
Locale.FRANCE: French (France)
Locale.GERMANY: German (Germany)
Locale.CHINA: Chinese (China)
Locale.JAPAN: Japanese (Japan)
Locale.ITALY: Italian (Italy)
Locale.KOREA: Korean (South Korea)
