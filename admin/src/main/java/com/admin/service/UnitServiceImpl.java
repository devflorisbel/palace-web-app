package com.admin.service;

import com.admin.dao.UnitDao;
import com.admin.domain.Unit;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author flori
 */
@Service
public class UnitServiceImpl implements UnitService{
    
    @Autowired
    private UnitDao unitDao;

    @Override
    public List<Unit> findAllUnits() {
        return (List<Unit>) unitDao.findAll();
    }

    @Override
    public void save(Unit unit) {
        unitDao.save(unit);
    }

    @Override
    public void delete(Unit unit) {
        unitDao.delete(unit);
    }

    @Override
    public Unit findUnit(Unit unit) {
        return unitDao.findById(unit.getId_unit()).orElse(null);
    }
    
}
