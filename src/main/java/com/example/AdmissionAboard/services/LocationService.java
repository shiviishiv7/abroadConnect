package com.example.AdmissionAboard.services;

import com.example.AdmissionAboard.dto.LocationDto;
import com.example.AdmissionAboard.model.Location;
import com.example.AdmissionAboard.repo.LocationRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private LocationRepository locationRepository;

    public Location createLocation(LocationDto location) {
        Location map = this.modelMapper.map(location, Location.class);
        return locationRepository.save(map);
    }

    public Location getLocationById(Long id) {
        return locationRepository.findById(id).orElse(null);
    }

    public List<Location> getAllLocations() {
        return locationRepository.findAll();
    }

    public Location updateLocation(Long id, Location updatedLocation) {
        Location location = locationRepository.findById(id).orElse(null);
        if (location != null) {
//            location.setCity(updatedLocation.getCity());
            location.setCountry(updatedLocation.getCountry());
            // Update other fields as needed
            return locationRepository.save(location);
        }
        return null;
    }

    public void deleteLocation(Long id) {
        locationRepository.deleteById(id);
    }
}

