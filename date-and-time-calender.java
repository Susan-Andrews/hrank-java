Calendar.getInstance() initializes a Calendar object to the current date and time.
Zero-Based Months:  Months are 0-based, so August is 7
1 for Sunday, 2 for Monday
int year = calendar.get(Calendar.YEAR);
int month = calendar.get(Calendar.MONTH); // Note: Months are 0-based (January is 0)
int day = calendar.get(Calendar.DAY_OF_MONTH);
int weekday= calendar.get(Calendar.DAY_OF_WEEK);

Setting a Specific Date:
Getting Date and Time Fields:
Adding or Subtracting Time:
Converting to Date:

Calendar calendar = Calendar.getInstance(); 
        calendar.add(Calendar.DATE, -15); 
        System.out.println("15 days ago: " + calendar.getTime()); 
        calendar.add(Calendar.MONTH, 4); 
        System.out.println("4 months later: " + calendar.getTime()); 
        calendar.add(Calendar.YEAR, 2); 
        System.out.println("2 years later: " + calendar.getTime()); 
Current Calendar's Year: 2018
Current Calendar's Day: 28
Current MINUTE: 10
Current SECOND: 45

  OR 
Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2023);
        calendar.set(Calendar.MONTH, 0);
        calendar.set(Calendar.DATE, 8);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);

        // calendar.set(2023, 0, 8, 0, 0, 0);

        Date date = calendar.getTime();

        System.out.println(date);

Sun Jan 08 00:00:00 GMT 2023
