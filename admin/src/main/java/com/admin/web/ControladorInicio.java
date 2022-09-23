package com.admin.web;

import com.admin.domain.Employee;
import com.admin.domain.Item;
import com.admin.domain.Orden;
import com.admin.domain.Property;
import com.admin.domain.Servicio;
import com.admin.domain.Unit;
import com.admin.service.EmployeeService;
import com.admin.service.ItemService;
import com.admin.service.OrdenService;
import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.admin.service.PropertyService;
import com.admin.service.ServicioService;
import com.admin.service.UnitService;

/**
 *
 * @author palac
 */
@Controller
@Slf4j
public class ControladorInicio {

    @Autowired
    private EmployeeService employeeservice;

    @Autowired
    private PropertyService propertyService;

    @Autowired
    private ServicioService servicioService;

    @Autowired
    private ItemService itemService;

    @Autowired
    private UnitService unitService;

    @Autowired
    private OrdenService ordenService;

    //dashboard palace
    @GetMapping("/")
    public String inicio(Model model, @AuthenticationPrincipal User user) {
        log.info("ejecutando el controlador Spring MVCs");
        log.info("usuario que hizo login " + user);//recuperar usuario
        return "index";
    }

    //employees administration
    @GetMapping("/employees")
    public String employees(Model model) {
        var employee = employeeservice.findAllEmployees();
        var service = servicioService.findAllServicios();
        model.addAttribute("employee", employee);
        model.addAttribute("service", service);
        return "admin-employees";
    }

    @GetMapping("/add")
    public String add(Employee employee, Model model) {
        //consultar service
        var servicio = servicioService.findAllServicios();
        model.addAttribute("servicio", servicio);
        return "update";
    }

    @PostMapping("/save")
    public String save(@Valid Employee employee, Errors errores) {
        if (errores.hasErrors()) {
            return "update";
        }
        employeeservice.save(employee);
        return "redirect:/employees";
    }

    @GetMapping("/edit/{idemployee}")
    public String edit(Employee employee, Model model) {
        employee = employeeservice.findEmployee(employee);
        model.addAttribute("employee", employee);
        //consultar service
        var servicio = servicioService.findAllServicios();
        model.addAttribute("servicio", servicio);
        return "update";
    }

    @GetMapping("/delete")
    public String delete(Employee employee) {
        employeeservice.delete(employee);
        return "redirect:/employees";
    }

    //properties administration
    @GetMapping("/properties")
    public String properties(Model model) {
        var property = propertyService.findAllProperties();
        model.addAttribute("property", property);
        return "admin-properties";
    }

    @GetMapping("/add-property")
    public String addProperty(Property property) {
        return "update-property";
    }

    @PostMapping("/save-property")
    public String saveProperty(@Valid Property property, Errors errores) {
        if (errores.hasErrors()) {
            return "update-property";
        }
        propertyService.save(property);
        return "redirect:/properties";
    }

    @GetMapping("/edit-property/{id_property}")
    public String editProperty(Property property, Model model) {
        property = propertyService.findProperty(property);
        model.addAttribute("property", property);
        return "update-property";
    }

    @GetMapping("/delete-property")
    public String deleteProperty(Property property) {
        propertyService.delete(property);
        return "redirect:/properties";
    }

    //servicios administration
    @GetMapping("/services")
    public String services(Model model) {
        var servicio = servicioService.findAllServicios();
        model.addAttribute("servicio", servicio);
        return "admin-services";
    }

    @GetMapping("/add-service")
    public String addService(Servicio servicio) {
        return "update-service";
    }

    @PostMapping("/save-service")
    public String saveService(@Valid Servicio servicio, Errors errores) {
        if (errores.hasErrors()) {
            return "update-service";
        }
        servicioService.save(servicio);
        return "redirect:/services";
    }

    @GetMapping("/edit-service/{id_service}")
    public String editService(Servicio servicio, Model model) {
        servicio = servicioService.findServicio(servicio);
        model.addAttribute("servicio", servicio);
        return "update-service";
    }

    @GetMapping("/delete-service")
    public String deleteService(Servicio servicio) {
        servicioService.delete(servicio);
        return "redirect:/services";
    }

    //item administration
    @GetMapping("/items")
    public String items(Model model) {
        var item = itemService.findAllItems();
        //consultar property
        var property = propertyService.findAllProperties();
        //consultar servicio
        var service = servicioService.findAllServicios();
        model.addAttribute("item", item);
        model.addAttribute("property", property);
        model.addAttribute("service", service);
        return "admin-items";
    }

    @GetMapping("/add-item")
    public String addItem(Item item, Model model) {
        //consultar property
        var property = propertyService.findAllProperties();
        model.addAttribute("property", property);
        //consultar service
        var servicio = servicioService.findAllServicios();
        model.addAttribute("servicio", servicio);
        return "update-item";
    }

    @PostMapping("/save-item")
    public String saveItem(@Valid Item item, Errors errores) {
        if (errores.hasErrors()) {
            return "update-item";
        }
        itemService.save(item);
        return "redirect:/items";
    }

    @GetMapping("/edit-item/{id_item}")
    public String editItem(Item item, Model model) {
        item = itemService.findItem(item);
        model.addAttribute("item", item);
        //consultar property
        var property = propertyService.findAllProperties();
        model.addAttribute("property", property);
        //consultar service
        var servicio = servicioService.findAllServicios();
        model.addAttribute("servicio", servicio);
        return "update-item";
    }

    @GetMapping("/delete-item")
    public String deleteItem(Item item) {
        itemService.delete(item);
        return "redirect:/items";
    }

    //units administration
    @GetMapping("/units")
    public String units(Model model) {
        var unit = unitService.findAllUnits();
        //consultar property
        var property = propertyService.findAllProperties();
        model.addAttribute("unit", unit);
        model.addAttribute("property", property);
        return "admin-units";
    }

    @GetMapping("/add-unit")
    public String addUnit(Unit unit, Model model) {
        //consultar property
        var property = propertyService.findAllProperties();
        model.addAttribute("property", property);
        return "update-unit";
    }

    @PostMapping("/save-unit")
    public String saveUnit(@Valid Unit unit, Errors errores) {
        if (errores.hasErrors()) {
            return "update-unit";
        }
        unitService.save(unit);
        return "redirect:/units";
    }

    @GetMapping("/edit-unit/{id_unit}")
    public String editUnit(Unit unit, Model model) {
        unit = unitService.findUnit(unit);
        model.addAttribute("unit", unit);
        //consultar property
        var property = propertyService.findAllProperties();
        model.addAttribute("property", property);
        return "update-unit";
    }

    @GetMapping("/delete-unit")
    public String deleteUnit(Unit unit) {
        unitService.delete(unit);
        return "redirect:/units";
    }

    //ordenes administration
    @GetMapping("/ordenes")
    public String ordenes(Model model) {
        var orden = ordenService.findAllOrdenes();
        model.addAttribute("orden", orden);
        //consultar property
        var property = propertyService.findAllProperties();
        model.addAttribute("property", property);
        //consultar unit
        var unit = unitService.findAllUnits();
        model.addAttribute("unit", unit);
        return "admin-ordenes";

    }

    @GetMapping("/add-orden/{id_property}")
    public String addOrden(Orden orden, Property property, Model model) {
        //consultar propiedad
        property = propertyService.findProperty(property);
        model.addAttribute("property", property);
        //consultar unit
        var unit = unitService.findAllUnits();
        model.addAttribute("unit", unit);
        return "update-orden";
    }

    @PostMapping("/save-orden")
    public String saveOrden(@Valid Orden orden, Errors errores) {
        if (errores.hasErrors()) {
            return "update-orden";
        }
        ordenService.save(orden);
        return "redirect:/ordenes";
    }

    @GetMapping("/edit-orden/{id_orden}")
    public String editOrden(Orden orden, Model model) {
        orden = ordenService.findOrden(orden);
        model.addAttribute("orden", orden);
        //consultar property
        var property = propertyService.findAllProperties();
        model.addAttribute("property", property);
        //consultar unit
        var unit = unitService.findAllUnits();
        model.addAttribute("unit", unit);
        return "update-orden";
    }

    @GetMapping("/delete-orden")
    public String deleteOrden(Orden orden) {
        ordenService.delete(orden);
        return "redirect:/ordenes";
    }

}
