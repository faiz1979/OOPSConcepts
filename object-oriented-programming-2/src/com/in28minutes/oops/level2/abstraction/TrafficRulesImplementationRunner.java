package com.in28minutes.oops.level2.abstraction;

public class TrafficRulesImplementationRunner {

	public static void main(String[] args) {
		
		TrafficRulesImplementationMaharashtra trafficrulesforMaha = new TrafficRulesImplementationMaharashtra();
		trafficrulesforMaha.signal();
		trafficrulesforMaha.speedLimit();
		
		TrafficRulesImplementationKarnataka trafficrulesforKannada = new TrafficRulesImplementationKarnataka();
		trafficrulesforKannada.signal();
		trafficrulesforKannada.speedLimit();

	}

}
