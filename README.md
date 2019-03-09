# ParkingLot
A simulation of parking lot system.

## Problem Statement
I own a parking lot that can hold up to 'n' cars at any given point in time. Each slot is
given a number starting at 1 increasing with increasing distance from the entry point
in steps of one. I want to create an automated ticketing system that allows my
customers to use my parking lot without human intervention.
When a car enters my parking lot, I want to have a ticket issued to the driver. The
ticket issuing process includes us documenting the registration number (number
plate) and the colour of the car and allocating an available parking slot to the car
before actually handing over a ticket to the driver (we assume that our customers are
nice enough to always park in the slots allocated to them). The customer should be
allocated a parking slot which is nearest to the entry. At the exit the customer returns
the ticket which then marks the slot they were using as being available.
Due to government regulation, the system should provide me with the ability to findout:
- Registration numbers of all cars of a particular colour.
- Slot number in which a car with a given registration number is parked.
- Slot numbers of all slots where a car of a particular colour is parked.

## HOW TO
Build:
1. Navigate to project root
2. Open terminal
3. Use command below:
```shell
$ bin/setup
```

Run: 
```shell
$ bin/parking_lot
```
or
```shell
$ bin/parking_lot <filename.txt>
``` 
File should **only** contains commands below.

## Available commands
```shell
$ create_parking_lot <n>
```
Create parking lot with **n** slots available.

```shell
$ park <regNum> <color>
```
Allocate nearest slot from entry for a car with **regNum** and **color** descriptor.

```shell
$ leave <i>
```
Deallocate/free **i**-th slot in the parking lot.

```shell
$ status
```
Print parking lot status(Parked cars' descriptors).

```shell
registration_numbers_for_cars_with_colour <color>
```
Print cars' registration_numbers with **color** descriptor in the parking lot.

```shell
slot_numbers_for_cars_with_colour <color>
```
Print cars' slot numbers with **color** descriptor in the parking lot.

```shell
slot_number_for_registration_number <regNum>
```
Print car's slot numbers with **regNum** descriptor in the parking lot.


### Solution by :

Jose Hosea

joshos1945@yahoo.com
