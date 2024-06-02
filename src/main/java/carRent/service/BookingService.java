package carRent.service;

import carRent.model.Booking;
import carRent.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    @Autowired
    BookingRepository bookingRepository;


    public void save(Booking booking) {

        bookingRepository.save(booking);

    }

    public List<Booking> findAll() {
        return bookingRepository.findAll();
    }

    public boolean existById(Long id){
        return bookingRepository.existsById(id);
    }

}

