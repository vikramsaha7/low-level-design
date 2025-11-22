# SOLID Principles Notes

## Overview
- Reduce duplicate code, maintainability
- Readable, flexible, reduces complexity

## Single Responsibility Principle (SRP)
A class should have only one reason to change.

### Before SRP
```java
class Invoice {
    Book book;
    int quantity;
    int calculateTotal() {}
    void printInvoice() {}
    void saveToDB() {}
}
```

### After SRP
```java
class Invoice { int calculateTotal() {} }

class InvoicePrinter { void printInvoice() {} }

class InvoiceDao { void saveToDB() {} }
```

## Open/Closed Principle (OCP)
Open for extension, closed for modification.

### Correct Design
- Base `InvoiceDao`
- Derived `DatabaseInvoiceDao`, `FileInvoiceDao`

## Liskov Substitution Principle (LSP)
Subclasses should replace parent without breaking behavior.

### Violation Example
Cycle implementing `turnOnEngine()` incorrectly.

### Fix
Separate abstractions:
- EngineVehicle → Car, Motorcycle
- Bicycle

## Interface Segregation Principle (ISP)
Clients shouldn't implement unused methods.

### Violation
Bike implementing `openDoors()` unnecessarily.

### Fix
Split interfaces:
- TwoWheeler
- FourWheeler

## Dependency Inversion Principle (DIP)
Depend on abstractions, not concrete classes.

### Fix
Keyboard & Mouse as interfaces (wired/bluetooth implementations)

## Strategy Pattern
Use composition to avoid duplicate `drive()` logic.

```
Vehicle — has-a → DriveStrategy
```

### Example Strategy
- NormalDrive
- SpecialDrive
