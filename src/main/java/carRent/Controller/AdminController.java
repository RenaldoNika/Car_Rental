package carRent.Controller;


import java.util.List;
import carRent.model.Booking;
import carRent.model.Car;
import carRent.service.BookingService;
import carRent.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminController {

    @Autowired
    CarService carService;
    @Autowired
    BookingService bookingService;

    @GetMapping("/admin/new/car")
    public String home() {
        return "admin";
    }

    @GetMapping("admin/books")
    public String adminCars(Model model) {
        List<Booking> bookings = bookingService.findAll();
        model.addAttribute("bookings", bookings);
        return "Pronotimet";
    }

    @GetMapping("/makina")
    public String getAllCars(Model model) {
        List<Car> cars = carService.findALl();
        model.addAttribute("cars", cars);
        return "carList2";
    }

    @PostMapping("/admin/post/car")
    public String homeAdmin(Model model, Car car) {
        carService.save(car);
        model.addAttribute("car", car);
        return "carPosted";
    }

    @PostMapping("/bookings/save")
    public String saveBooking(@ModelAttribute Booking booking) {

        bookingService.Save(booking);
        return "redirect:/makina";
    }

    @GetMapping("/bookCar")
    public String showBookingForm(@RequestParam("carId") Long carId, Model model) {
        Car car = carService.findByID(carId);
        model.addAttribute("car", car);
        model.addAttribute("booking", new Booking());
        return "/bookings2";
    }

}