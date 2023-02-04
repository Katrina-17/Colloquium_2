package variant15clock;

/**
 * Класс, представляющий стрелочные часы.
 */
public class OldClockWithHands implements ClockWithHands {

    /**
     * Текущий поворот часовой стрелки.
     */
    private int hourHandRotation;

    /**
     * Текущий поворот минутной стрелки.
     */
    private int minuteHandRotation;


    /**
     * Конструктор класса.
     * @param hourHandRotation Текущий поворот часовой стрелки.
     * @param minuteHandRotation Текущий поворот минутной стрелки.
     * @throws IllegalArgumentException Исключение в случае передачи некорректного количества часов/минут.
     */
    public OldClockWithHands(int hourHandRotation, int minuteHandRotation) throws IllegalArgumentException {
        if (hourHandRotation < 0 || hourHandRotation > 360 ) {
            throw new IllegalArgumentException("Incorrect hour hand rotation: " + hourHandRotation);
        }
        if (minuteHandRotation < 0 || minuteHandRotation > 360) {
            throw new IllegalArgumentException("Incorrect minute hand rotation: " + minuteHandRotation);
        }
        this.hourHandRotation = hourHandRotation;
        this.minuteHandRotation = minuteHandRotation;
    }

    /**
     * Метод для получения текущего поворота часовой стрелки.
     * @return Текущий поворот часовой стрелки (в градусах, от 0 до 360).
     */
    @Override
    public int getHourHandRotation() {
        return hourHandRotation;
    }

    /**
     * Метод для получения текущего поворота минутной стрелки.
     * @return Текущий поворот минутной стрелки (в градусах, от 0 до 360).
     */
    @Override
    public int getMinuteHandRotation() {
        return minuteHandRotation;
    }

    /**
     * Метод для добавления к текущему времени некоторого количества часов.
     * @param hours Количество добавляемых часов.
     */
    @Override
    public void addHours(int hours) {
        hourHandRotation = (hourHandRotation + hours * 30) % 360;
    }

    /**
     * Метод для добавления к текущему времени некоторого количества минут.
     * @param minutes Количество добавляемых минут.
     */
    @Override
    public void addMinutes(int minutes) {
        int allMinutes = this.minuteHandRotation + minutes * 6;
        addHours(allMinutes / 360);
        minuteHandRotation = allMinutes % 360;
    }
}
