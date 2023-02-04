package variant15clock;

/**
 * Тестовый класс для демонстрации работы адаптера в сравнении с объектом с целевым интерфейсом.
 */
public class TestClock {
    public static void main(String[] args) {
        // Задаём настоящим цифровым и стрелочным часам одинаковое время 0:15
        NewDigitalClock realDigitalClock = new NewDigitalClock(0, 15);
        OldClockWithHands clockWithHands = new OldClockWithHands(0, 90);

        // Создаём адаптер
        DigitalClock fakeDigitalClock = new ClockAdapter(clockWithHands);

        // Проверяем аналогичность поведения настоящих и "адаптированных" цифровых часов:
        System.out.println("Текущее количество часов: ");
        System.out.println("Настоящие: " + realDigitalClock.getHours());
        System.out.println("Адаптированные: " + fakeDigitalClock.getHours() + "\n");

        System.out.println("Текущее количество минут: ");
        System.out.println("Настоящие: " + realDigitalClock.getMinutes());
        System.out.println("Адаптированные: " + fakeDigitalClock.getMinutes() + "\n");

        System.out.println("Плюс 46 минут (новое время: 01:01): ");
        realDigitalClock.addMinutes(46);
        fakeDigitalClock.addMinutes(46);
        System.out.println("Настоящие: " + realDigitalClock.getHours() + ":" + realDigitalClock.getMinutes());
        System.out.println("Адаптированные: " + fakeDigitalClock.getHours() + ":" +
                fakeDigitalClock.getMinutes() + "\n");

        System.out.println("Плюс 1 час (новое время: 02:01): ");
        realDigitalClock.addHours(1);
        fakeDigitalClock.addHours(1);
        System.out.println("Настоящие: " + realDigitalClock.getHours() + ":" + realDigitalClock.getMinutes());
        System.out.println("Адаптированные: " + fakeDigitalClock.getHours() + ":" +
                fakeDigitalClock.getMinutes() + "\n");
    }
}
