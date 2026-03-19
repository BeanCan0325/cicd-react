import Q8_StudentList from "../../components/training/Q8_StudentList.jsx"

export default function Q8_StudentPage() {
    const students = [
        { name: "김학생", score: 90 },
        { name: "이학생", score: 80 }
    ]

    return (
        <Q8_StudentList students={students}/>
    )

}
