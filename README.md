# Disaster Response Coordination Platform (DRCP)

**Approved By:** Renuka Alakunta  
**Approval Date:** 22nd November 2024  

## **Project Overview**
The **Disaster Response Coordination Platform (DRCP)** is a software solution designed to streamline disaster response and recovery efforts. The platform addresses the challenges of fragmented communication, inefficient resource allocation, and lack of real-time data by integrating communication, resource management, and volunteer coordination into a single system.  

---

## **Team**
**Group 14 Members:**
- Yohan Markose  
- Hrishikesh Kulkarni  
- Abhishek Nejkar  
- Advait Wakulkar  

---

## **Problem Statement**
Natural disasters and humanitarian crises cause immense destruction and displacement, exacerbated by inefficient traditional response systems. These systems are plagued by:
- Disorganized communication leading to delayed responses.
- Poor allocation of resources like food, water, and medical supplies.
- Lack of tools for tracking volunteer efforts and resource distribution.
- Limited access to real-time data for informed decision-making.
- Insufficient community engagement in recovery efforts.
- Fragmentation among multiple stakeholders.

---

## **Solution**
The **Disaster Response and Recovery Platform (DRCP)** provides a centralized system for:
- Real-time information sharing on disaster impacts and resource needs.
- Efficient allocation and tracking of resources to ensure timely aid distribution.
- Volunteer management, including recruitment, task assignment, and performance tracking.
- Community engagement through modules for feedback and suggestions.
- Damage and needs assessments for prioritized response actions.
- Generating reports on resource utilization and disaster response progress.

---

## **Ecosystem Hierarchy**

### **Network**
- **International Disaster Response Network (IDRN)**

### **Enterprises**
1. National Emergency Management Authority  
2. International Humanitarian Aid Corporation  
3. Global Resource Distribution Group  
4. Emergency Response Systems Ltd.

### **Organizations**
1. Emergency Operations Center  
2. Resource Management Division  
3. Field Response Unit  
4. Damage Assessment Department  
5. Logistics and Supply Chain Unit  
6. Healthcare Institutions  
7. Community Organizations  
8. Response Team Unit  

---

## **Roles**
1. System Administrator  
2. Emergency Operations Coordinator  
3. Resource Allocation Specialist  
4. Field Response Coordinator  
5. Analyst  
6. Logistics Coordinator  
7. Hospital Representative  
8. Citizen  
9. Volunteer Coordinator  
10. Disaster Relief Team Member  
11. Response Coordinator  

---

## **Use Cases**
- Real-time information sharing on disaster impacts and resource needs.
- Efficient resource allocation and tracking for aid distribution.
- Volunteer management, including recruitment and task assignment.
- Community modules for feedback and participation.
- Conducting damage and needs assessments for effective response prioritization.
- Generating reports on:
  - Resource utilization.
  - Volunteer performance.
  - Disaster impact and recovery progress.

---

## **Folder Structure**
```plaintext
DRCP/
│
├── src/
│   ├── model/                    # Core application models (e.g., Disaster, User, Resource)
│   ├── ui/                       # User interface components (e.g., JPanels, dialogs)
│   ├── controllers/              # Controllers for handling application logic
│   ├── services/                 # Service layer for processing business logic
│   ├── utils/                    # Utility classes and helper functions
│   └── main/                     # Main application entry point
│
├── docs/                         # Documentation (e.g., UML diagrams, architecture overview)
├── assets/                       # Static assets (e.g., images, icons)
├── test/                         # Unit tests and test cases
├── lib/                          # Third-party libraries or dependencies
├── config/                       # Configuration files (e.g., database config, environment variables)
├── README.md                     # Project overview and instructions
└── LICENSE                       # License information
