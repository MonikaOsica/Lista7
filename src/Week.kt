enum class Week {
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

    fun isWeekend(days: Week): Boolean {
        return when (days) {
            Week.Monday -> false
            Week.Tuesday -> false
            Week.Wednesday -> false
            Week.Thursday -> false
            Week.Friday -> false
            Week.Saturday -> true
            Week.Sunday -> true
        }
    }

    fun isWorkingDay(days: Week): Boolean {
        return when (days) {
            Week.Monday -> true
            Week.Tuesday -> true
            Week.Wednesday -> true
            Week.Thursday -> true
            Week.Friday -> true
            Week.Saturday -> false
            Week.Sunday -> false
        }
    }
}