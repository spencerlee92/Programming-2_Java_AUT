public class SimpleDate {
	private int day;
	private int month;
	private int year;

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if ((day >= 1) && (day <= 31)) {
			this.day = day;
		} else {
			this.day = 1;
		}
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if ((month >= 1) && (month <= 12)) {
			this.month = month;
		} else {
			this.month = 1;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if ((year >= 2000) && (year <= 2015)) {
			this.year = year;
		} else {
			this.year = 2015;
		}
	}

	public void setDate(int aDay, int aMonth, int aYear) {
		this.setDay(aDay);
		this.setMonth(aMonth);
		this.setYear(aYear);
	}

	public SimpleDate(int day, int month, int year) {
		setDate(day, month, year);
	}

	public SimpleDate() {
		this(1, 1, 2015);
	}

	public String toString() {
		return this.getDay() + "/" + this.getMonth() + "/" + this.getYear();
	}

	public boolean isSameDate(SimpleDate aDate) {
		if ((this.getDay() == aDate.getDay())
				&& (aDate.getMonth() == this.getMonth())
				&& (aDate.getYear() == this.getYear())) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isBefore(SimpleDate aDate) {
		if (this.getYear() == aDate.getYear()) {
			if (this.getMonth() == aDate.getMonth()) {
				if (this.getDay() == aDate.getDay()) {
					return false;
				} else if (this.getDay() < aDate.getDay()) {
					return true;
				} else if (this.getDay() > aDate.getDay()) {
					return false;
				}

			} else if (this.getMonth() < aDate.getMonth()) {
				return true;

			} else if (this.getMonth() > aDate.getMonth()) {
				return false;
			}
		} else if (this.getYear() < aDate.getYear()) {
			return true;
		}
		return false;
		

	}
	public boolean isAfter(SimpleDate aDate)
	{
		return !isBefore(aDate);
	}
}
