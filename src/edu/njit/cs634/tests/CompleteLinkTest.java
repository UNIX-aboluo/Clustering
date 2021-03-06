package edu.njit.cs634.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import edu.njit.cs634.knn.Cluster;
import edu.njit.cs634.knn.CompleteLinkClustering;
import edu.njit.cs634.knn.PointsVector;
import edu.njit.cs634.knn.SingleLinkClustering;

public class CompleteLinkTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void simpleCompleteTest() {
		PointsVector pv1 = new PointsVector(40, 53, 1);
		PointsVector pv2 = new PointsVector(22, 38, 1);
		PointsVector pv3 = new PointsVector(36, 32, 1);
		PointsVector pv4 = new PointsVector(26, 19, 1);
		PointsVector pv5 = new PointsVector(8, 41, 1);
		PointsVector pv6 = new PointsVector(45, 30, 1);
		
		PointsVector[] vectors = new PointsVector[6];
		vectors[0] = pv1;
		vectors[1] = pv2;
		vectors[2] = pv3;
		vectors[3] = pv4;
		vectors[4] = pv5;
		vectors[5] = pv6;
		
		CompleteLinkClustering slc = new CompleteLinkClustering(6, vectors);
		ArrayList<Cluster> clusters = slc.assignClusters();
		assertTrue("Check number of clusters - 6", clusters.size() == 6);
	}
	
	@Test
	public void createThreeClusters()
	{
		PointsVector pv1 = new PointsVector(40, 53, 1);
		PointsVector pv2 = new PointsVector(22, 38, 1);
		PointsVector pv3 = new PointsVector(36, 32, 1);
		PointsVector pv4 = new PointsVector(26, 19, 1);
		PointsVector pv5 = new PointsVector(8, 41, 1);
		PointsVector pv6 = new PointsVector(45, 30, 1);
		
		PointsVector[] vectors = new PointsVector[6];
		vectors[0] = pv1;
		vectors[1] = pv2;
		vectors[2] = pv3;
		vectors[3] = pv4;
		vectors[4] = pv5;
		vectors[5] = pv6;
		
		//Check which clusters have which Vectors
		
		CompleteLinkClustering slc = new CompleteLinkClustering(3, vectors);
		ArrayList<Cluster> clusters = slc.assignClusters();
		assertTrue("Check number of clusters - 3", clusters.size() == 3);
	}
	
	@Test
	public void createOneClusters()
	{
		PointsVector pv1 = new PointsVector(40, 53, 1);
		PointsVector pv2 = new PointsVector(22, 38, 1);
		PointsVector pv3 = new PointsVector(36, 32, 1);
		PointsVector pv4 = new PointsVector(26, 19, 1);
		PointsVector pv5 = new PointsVector(8, 41, 1);
		PointsVector pv6 = new PointsVector(45, 30, 1);
		
		PointsVector[] vectors = new PointsVector[6];
		vectors[0] = pv1;
		vectors[1] = pv2;
		vectors[2] = pv3;
		vectors[3] = pv4;
		vectors[4] = pv5;
		vectors[5] = pv6;
		
		//Check which clusters have which Vectors
		
		CompleteLinkClustering slc = new CompleteLinkClustering(1, vectors);
		ArrayList<Cluster> clusters = slc.assignClusters();
		assertTrue("Check number of clusters - 1", clusters.size() == 1);
	}

}
