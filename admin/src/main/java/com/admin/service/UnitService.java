package com.admin.service;

import com.admin.domain.Unit;
import java.util.List;

/**
 *
 * @author flori
 */

public interface UnitService {
    
    public List<Unit> findAllUnits();
    
    public void save(Unit unit);
    
    public void delete(Unit unit);
    
    public Unit findUnit(Unit unit);
    
    
}
