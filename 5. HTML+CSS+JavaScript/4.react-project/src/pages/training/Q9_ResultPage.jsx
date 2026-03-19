import Q9_Result from "../../components/training/Q9_Result.jsx"

export default function Q9_ResultPage() {
    const students = [
        { name: "김학생", score: 90 },
        { name: "이학생", score: 80 }
    ]

    return (
        <Q9_Result students={students}></Q9_Result>
    )
}