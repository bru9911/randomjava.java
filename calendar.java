 public static Date getFirstDayOfMonth(Calendar c) {
   int year = c.get(Calendar.YEAR);
   int month = c.get(Calendar.MONTH);
   int day = 1;
   c.set(year, month, day, 0, 0, 0);
   return c.getTime();
 }
