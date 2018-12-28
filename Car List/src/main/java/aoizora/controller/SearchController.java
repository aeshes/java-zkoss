package aoizora.controller;

import aoizora.domain.Car;
import aoizora.service.CarService;
import aoizora.service.CarServiceImpl;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.ListModelList;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Textbox;

import java.util.List;

public class SearchController extends SelectorComposer<Component> {

    @Wire
    private Textbox keywordBox;

    @Wire
    private Listbox carListBox;

    private CarService carService = new CarServiceImpl();

    @Listen("onClick = #searchButton")
    public void search() {
        String keyword = keywordBox.getValue();
        List<Car> result = carService.search(keyword);
        carListBox.setModel(new ListModelList<Car>(result));
    }
}
