package variant15clock;

/**
 * Класс, представляющий цифровые часы.
 */
public class NewDigitalClock implements DigitalClock {

    /**
     * Текущее количество часов.
     */
    private int hours;

    /**
     * Текущее количество минут.
     */
    private int minutes;

    /**
     * Конструктор класса.
     * @param hours Текущее количество часов.
     * @param minutes Текущее количество минут.
     * @throws IllegalArgumentException Исключение в случае передачи некорректного количества часов/минут.
     */
    public NewDigitalClock(int hours, int minutes) throws IllegalArgumentException {
        if (minutes < 0 || minutes > 59) {
            throw new IllegalArgumentException("Incorrect number of minutes: " + minutes);
        }
        // Часы со шкалой 0-12 для более удобного сравнения со стрелочными часами.
        if (hours < 0 || hours > 12) {
            throw new IllegalArgumentException("Incorrect number of hours: " + hours);
        }
        this.hours = hours;
        this.minutes = minutes;
    }

    /**
     * Метод для получения текущего количества часов.
     * @return Текущее количество часов.
     */
    @Override
    public int getHours() {
        return hours;
    }

    /**
     * Метод для получения текущего количества минут.
     * @return Текущее количество минут.
     */
    @Override
    public int getMinutes() {
        return minutes;
    }

    /**
     * Метод для добавления к текущему времени некоторого количества часов.
     * @param hours Прибавляемое количество часов.
     */
    @Override
    public void addHours(int hours) {
        this.hours = (this.hours + hours) % 12;
    }

    /**
     * Метод для добавления к текущему времени некоторого количества минут.
     * @param minutes Прибавляемое количество минут.
     */
    @Override
    public void addMinutes(int minutes) {
        int allMinutes = this.minutes + minutes;
        addHours(allMinutes / 60);
        this.minutes = allMinutes % 60;
    }
}
