package variant15clock;

/**
 * Адаптер, реализуюший для стрелочных часов интерфейс, аналочичный интерфейсу цифровых часов.
 */
public class ClockAdapter implements DigitalClock {

    /**
     * Сами стрелочные часы.
     */
    private ClockWithHands clockWithHands;


    /**
     * Конструктор класса.
     * @param clock Стрелочные часы.
     */
    public ClockAdapter(ClockWithHands clock) {
        clockWithHands = clock;
    }

    /**
     * Метод для получения текущего количества часов.
     * @return Текущее количество часов.
     */
    @Override
    public int getHours() {
        return clockWithHands.getHourHandRotation() / 30;
    }

    /**
     * Метод для получения текущего количества минут.
     * @return Текущее количество минут.
     */
    @Override
    public int getMinutes() {
        return clockWithHands.getMinuteHandRotation() / 6;
    }

    /**
     * Метод для увеличения текущего времени на некоторое количество часов.
     * @param hours Прибавляемое количество часов.
     */
    @Override
    public void addHours(int hours) {
        clockWithHands.addHours(hours);
    }

    /**
     * Метод для увеличения текущего времени на некоторое количество минут.
     * @param minutes Прибавляемое количество минут.
     */
    @Override
    public void addMinutes(int minutes) {
        clockWithHands.addMinutes(minutes);
    }
}
