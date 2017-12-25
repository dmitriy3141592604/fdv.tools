package fdv.tools.mc;

import java.util.UUID;
import java.util.function.Consumer;

// TODO 2017-12-20 08:50 Выделить в отдельную утилиту
// TODO 2017-12-20 09:32 Формировать файл uuid
// TODO 2017-12-20 09:63 Проверять наличие файла
// TODO 2017-12-20 10:32 Нужен параметр для принудительной перезаписи файла
// TODO 2017-12-20 09:11 Должен подверкаться регрессии
// XXX 2017-12-20 09:12 Все-таки должна формироваться hex строка
public class MarkerCreator implements Consumer<String[]> {

	public static void main(String... args) throws Exception {
		new MarkerCreator().accept(args);
	}

	@Override
	public void accept(String[] t) {
		System.out.println(UUID.randomUUID().toString());
	}

}
