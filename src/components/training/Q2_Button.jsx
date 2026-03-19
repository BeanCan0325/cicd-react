export default function Q2_Button() {
    function handleClick() {
        alert("버튼이 클릭되었습니다.")
    }

    // const handleClick = () => {

    // }

    return( 
        <button onClick={handleClick}>클릭</button>
    )
}