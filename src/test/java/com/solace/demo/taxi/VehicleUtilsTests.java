/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.solace.demo.taxi;

import java.awt.geom.Point2D;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

public class VehicleUtilsTests {
    
    @Test
    public void testHeading() throws FileNotFoundException, IOException {
        RouteLoader.INSTANCE.load("coords_single.txt");

        System.out.println("Remember: x=lon, y=lat");
        System.out.println(RouteLoader.INSTANCE.getCoord(0,1));
        System.out.println(RouteLoader.INSTANCE.getCoord(0,2));
        System.out.println(VehicleUtils.calcHeading(0,1));

        
        Point2D.Float previous = new Point2D.Float(0,0);
        Point2D.Float current = new Point2D.Float(0,1);
        // heading north
        System.out.println(VehicleUtils.heading(previous,current));

        current = new Point2D.Float(1,0);
        // heading east
        System.out.println(VehicleUtils.heading(previous,current));

        current = new Point2D.Float(0,-1);
        // heading south
        System.out.println(VehicleUtils.heading(previous,current));

        current = new Point2D.Float(-1,0);
        // heading west
        System.out.println(VehicleUtils.heading(previous,current));

        
        
    }
    
    
}
